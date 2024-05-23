public class Solution {

    static int loopNodes(Node current) {
        int res = 1;
        Node temp = current;
        while (temp.next != current) {
            res++;
            temp = temp.next;
        }
        return res;
    }

    static Node findKthNode(Node head, int k) {
        Node slow = head, fast = head;
        slow = slow.next;
        fast = fast.next.next;
        int nodesInLoop = 0;
        while (fast != null && fast.next != null) {
            if (slow == fast) {
                nodesInLoop = loopNodes(slow);
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        Node startOfCycle = slow;
        Node iterator = head;
        int steps = k;
        while (steps-- > 0) {
            iterator = iterator.next;
            if (iterator == startOfCycle) {
                break;
            }
        }
        if (steps > 0) {
            steps %= nodesInLoop;
            while (steps-- > 0) {
                iterator = iterator.next;
            }
        }
        return iterator;
    }
}
