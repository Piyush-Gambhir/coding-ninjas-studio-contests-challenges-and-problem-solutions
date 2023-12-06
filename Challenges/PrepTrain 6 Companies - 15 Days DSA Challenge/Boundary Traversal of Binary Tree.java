
/************************************************************

 Following is the Binary Tree node structure:

 class TreeNode {
     int data;
     TreeNode left;
     TreeNode right;

     TreeNode(int data) {
         this.data = data;
         this.left = null;
         this.right = null;
     }
 }

 ************************************************************/

import java.util.*;

public class Solution {
    private static void traverseLeftBoundary(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        if (root.left != null) {
            result.add(root.data);
            traverseLeftBoundary(root.left, result);
        } else if (root.right != null) {
            result.add(root.data);
            traverseLeftBoundary(root.right, result);
        }
    }

    private static void traverseLeaves(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            result.add(root.data);
            return;
        }

        traverseLeaves(root.left, result);
        traverseLeaves(root.right, result);
    }

    private static void traverseRightBoundary(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        if (root.right != null) {
            traverseRightBoundary(root.right, result);
            result.add(root.data);
        } else if (root.left != null) {
            traverseRightBoundary(root.left, result);
            result.add(root.data);
        }

    }

    public static List<Integer> traverseBoundary(TreeNode root) {
        // Write your code here.

        if (root == null) {
            return null;
        }

        List<Integer> result = new ArrayList<>();
        result.add(root.data);

        traverseLeftBoundary(root.left, result);
        traverseLeaves(root.left, result);
        traverseLeaves(root.right, result);
        traverseRightBoundary(root.right, result);
        return result;
    }
}