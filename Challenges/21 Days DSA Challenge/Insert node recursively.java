public class Solution {
    public static Node<Integer> insertNode(Node<Integer> head, int pos, Node<Integer> newNode) {
        if (pos == 0) {
            newNode.next = head;
            return newNode;
        }

        if (head == null) {
            return null;
        }

        head.next = insertNode(head.next, pos - 1, newNode);
        return head;
    }
}
