/*
Problem Link: https://www.codingninjas.com/studio/problems/level-order-traversal_796002?interviewProblemRedirection=true&count=25&page=2&search=&sort_entity=company_count&sort_order=DESC&leftPanelTabValue=PROBLEM
*/

import java.util.*;
import java.io.*;
/*

	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T val;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

*/

import java.util.ArrayList;

public class Solution {

    public static ArrayList<Integer> getLevelOrder(BinaryTreeNode root) {
        // Your code goes here
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }

        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            BinaryTreeNode curr = q.poll();
            ans.add((int) curr.val);

            if (curr.left != null) {
                q.add(curr.left);
            }

            if (curr.right != null) {
                q.add(curr.right);
            }
        }

        return ans;
    }

}