
/*********************************************************

 Following is the TreeNode structure:

 class TreeNode {
     int data;
     TreeNode left;
     TreeNode right;
     TreeNode() {
         this.data = 0;
         this.left = null;
         this.right = null;
     }
     TreeNode(int data) {
         this.data = data;
         this.left = null;
         this.right = null;
     }
     TreeNode(int data, TreeNode left, TreeNode right) {
         this.data = data;
         this.left = left;
         this.right = right;
     }
 };
 ********************************************************/

import java.util.*;

public class Solution {

    public static List<Integer> predecessorSuccessor(TreeNode root, int key) {
        List<Integer> result = new ArrayList<>();
        findPredecessorSuccessor(root, key, result);
        return result;
    }

    private static void findPredecessorSuccessor(TreeNode root, int key, List<Integer> result) {
        TreeNode predecessor = null;
        TreeNode successor = null;

        while (root != null) {
            if (root.data == key) {
                if (root.left != null) {
                    TreeNode temp = root.left;
                    while (temp.right != null)
                        temp = temp.right;

                    predecessor = temp;
                }

                if (root.right != null) {
                    TreeNode temp = root.right;
                    while (temp.left != null)
                        temp = temp.left;

                    successor = temp;
                }
                break;
            } else if (root.data > key) {
                successor = root;
                root = root.left;
            } else {
                predecessor = root;
                root = root.right;
            }
        }

        result.add(predecessor != null ? predecessor.data : -1);
        result.add(successor != null ? successor.data : -1);
    }
}
