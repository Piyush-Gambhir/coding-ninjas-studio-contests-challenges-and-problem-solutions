
/************************************************************

 Following is the BinaryTreeNode class structure
 class BinaryTreeNode<T>
 {
     public:
     T data;
     BinaryTreeNode<T> left;
     BinaryTreeNode<T> right;
    
     BinaryTreeNode(T data)
     {
         this.data = data;
         left = null;
         right = null;
     }
 };
 ************************************************************/

import java.util.*;

public class Solution {
    public static int maxPathSum(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }

        int[] result = new int[1];
        result[0] = Integer.MIN_VALUE;

        find(root, result);

        return result[0];
    }

    public static int find(BinaryTreeNode<Integer> root, int[] result) {
        if (root == null) {
            return 0;
        }

        int leftSum = Math.max(0, find(root.left, result));
        int rightSum = Math.max(0, find(root.right, result));

        result[0] = Math.max(result[0], leftSum + rightSum + root.data);

        return Math.max(leftSum, rightSum) + root.data;
    }
}
