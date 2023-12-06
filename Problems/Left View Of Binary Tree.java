/*
Problem Link: https://www.codingninjas.com/studio/problems/left-view-of-binary-tree_625707?interviewProblemRedirection=true&count=25&page=2&search=&sort_entity=company_count&sort_order=DESC&leftPanelTabValue=PROBLEM
*/

/*************************************************************
 * 
 * Following is thr TreeNode class structure
 * 
 * class BinaryTreeNode<T>
 * {
 * T data;
 * BinaryTreeNode<T> left;
 * BinaryTreeNode<T> right;
 * 
 * BinaryTreeNode(T data) {
 * this.data = data;
 * left = null;
 * right = null;
 * }
 * };
 * 
 *************************************************************/

 
import java.util.*;
public class Solution {
    public static void printLeftView(TreeNode<Integer> root) {
        // Write your code here.

        if (root == null) {
            return;
        }

        Queue<TreeNode<Integer>> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            boolean flag = true;

            for (int i = 0; i < size; i++) {
                TreeNode<Integer> curr = q.poll();

                if (flag) {
                    System.out.print(curr.data + " ");
                    flag = false;
                }

                if (curr.left != null) {
                    q.add(curr.left);
                }

                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }

    }
}
