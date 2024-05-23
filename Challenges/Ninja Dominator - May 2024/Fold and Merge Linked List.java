/*
    Time Complexity : O(N)
    Space Complexity : O(1)
    
    Where 'N' is the number of nodes.
*/

/********************************************************
 * 
 * Following is the class structure of the Node class:
 * 
 * class Node
 * {
 * public:
 * int data;
 * Node next;
 * Node(int data)
 * {
 * this.data = data;
 * this.next = null;
 * }
 * };
 * 
 ********************************************************/

class Solution {

    public static Node foldAndMerge(Node head) {
        Node fast = head, prev = null, next = null;

        while (fast != null && fast.next != null) {

            fast = fast.next.next;

            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        Node ans = head;

        while (prev != null) {
            head.data = head.data * prev.data;
            prev = prev.next;
            head = head.next;
        }

        return ans;

    }
}
