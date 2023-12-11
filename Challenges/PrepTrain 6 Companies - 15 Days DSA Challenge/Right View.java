
/*************************************************************

    Following is the Binary Tree node structure:

    class BinaryTreeNode<Integer> {
        int data;
        BinaryTreeNode<Integer> left;
        BinaryTreeNode<Integer> right;
        public BinaryTreeNode(int data) {
            this.data = data;
        }
    }

*************************************************************/

import java.util.*;

public class Solution {
    public static ArrayList<Integer> printRightView(BinaryTreeNode<Integer> root) {
        // Write your code here.
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;
        Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                BinaryTreeNode<Integer> curr = q.poll();
                if (i == size - 1)
                    ans.add(curr.data);
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }
        }
        return ans;
    }
}
