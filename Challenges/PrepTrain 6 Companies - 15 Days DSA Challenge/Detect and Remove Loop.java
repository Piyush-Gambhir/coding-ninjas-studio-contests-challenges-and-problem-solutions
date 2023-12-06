
/*****************************************************
  
  Following is the structure of Node.
  public static class Node {
    
    int data;
    Node next;

    Node(int data) {
      this . data = data;
      this . next = null;
    }
  }

*****************************************************/

import java.util.*;

public class Solution {
    public static Node removeLoop(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                removeLoopHelper(head, slow);
                break;
            }
        }

        return head;
    }

    private static void removeLoopHelper(Node head, Node meetingPoint) {
        Node ptr1 = head;
        Node ptr2 = meetingPoint;

        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        while (ptr2.next != ptr1) {
            ptr2 = ptr2.next;
        }
        ptr2.next = null;
    }
}