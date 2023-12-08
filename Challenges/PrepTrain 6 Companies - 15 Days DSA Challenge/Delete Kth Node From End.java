/****************************************************************
 * 
 * Following is the class structure of the Node class:
 * 
 * class Node {
 * public int data;
 * public Node next;
 * public Node prev;
 * 
 * Node()
 * {
 * this.data = 0;
 * this.next = null;
 * this.prev = null;
 * }
 * 
 * Node(int data)
 * {
 * this.data = data;
 * this.next = null;
 * this.prev = null;
 * }
 * 
 * Node(int data, Node next)
 * {
 * this.data = data;
 * this.next = next;
 * this.prev = next;
 * }
 * };
 * 
 *****************************************************************/

public class Solution {
    public static Node removeKthNode(Node head, int K) {
        // Write your code here.

        Node current = head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }

        if (size == 0) {
            return null;
        }

        if (size == K) {
            return head.next;
        }

        current = head;
        for (int i = 0; i < size - K - 1; i++) {
            current = current.next;
        }

        current.next = current.next.next;

        return head;
    }
}