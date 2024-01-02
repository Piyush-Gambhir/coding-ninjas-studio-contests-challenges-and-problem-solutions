
/*************************************************************

Following is the class structure of the Node class:

    class Node {
		public int data;
		public Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
	  	}
    }

*************************************************************/
import java.util.*;
import java.io.*;

public class Solution {
    private static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static Node addNode(Node head) {
        // Write your code here.
        Node rev = reverse(head);
        Node temp = rev;
        int carry = 1;
        while (temp != null) {
            int sum = temp.data + carry;
            temp.data = sum % 10;
            carry = sum / 10;
            if (temp.next == null && carry > 0) {
                temp.next = new Node(carry);
                break;
            }
            temp = temp.next;
        }
        return reverse(rev);
    }
}