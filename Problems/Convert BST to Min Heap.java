import java.util.*;
import java.io.*;

/*************************************************************
 * 
 * Following is the Binary Tree node structure:
 * 
 * class BinaryTreeNode {
 * 
 * int data;
 * BinaryTreeNode left;
 * BinaryTreeNode right;
 * 
 * BinaryTreeNode(int data) {
 * this.data = data;
 * left = null;
 * right = null;
 * }
 * }
 * 
 *************************************************************/

public class Solution {

    private static void preOrder(BinaryTreeNode root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private static void bstToArray(BinaryTreeNode root,
            ArrayList<Integer> arr) {
        if (root == null)
            return;

        bstToArray(root.left, arr);

        arr.add(root.data);

        bstToArray(root.right, arr);
    }

    static int index;

    private static void arrToMinHeap(BinaryTreeNode root,
            ArrayList<Integer> arr) {
        if (root == null)
            return;
        root.data = arr.get(index++);

        arrToMinHeap(root.left, arr);
        arrToMinHeap(root.right, arr);
    }

    public static BinaryTreeNode convertBST(BinaryTreeNode root) {
        // Write your code here.
        index = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        bstToArray(root, arr);

        arrToMinHeap(root, arr);
        return root;
    }
}
