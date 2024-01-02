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

        if (head == null || K == 0) {
            return head;
        }

        Node slow = head;
        Node fast = head;

        for (int i = 0; i < K; i++) {

            if (fast.next == null) {
                Node next = head.next;
                head.next = null;
                head = next;

                return head;
            } else {
                fast = fast.next;
            }

        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return head;
    }
}