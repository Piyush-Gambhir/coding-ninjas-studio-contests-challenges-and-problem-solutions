
/************************************************************

    Following is the TreeNode class structure.

	class TreeNode<T> 
	{
	    public T data;
	    public TreeNode<T> left;
	    public TreeNode<T> right;

	    TreeNode(T data) 
	    {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}

************************************************************/
import java.util.*;

import javax.swing.tree.TreeNode;

import java.io.*;

public class Solution {
    private static void preOrder(TreeNode<Integer> root, List<Integer> list) {
        if (root == null)
            return;
        list.add(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static TreeNode<Integer> flattenBinaryTree(TreeNode<Integer> root) {
        // Write your code here.
        TreeNode<Integer> head = new TreeNode<Integer>(0);
        TreeNode<Integer> temp = head;
        List<Integer> list = new ArrayList<Integer>();
        preOrder(root, list);
        for (int i = 0; i < list.size(); i++) {
            temp.right = new TreeNode<Integer>(list.get(i));
            temp = temp.right;
        }
        return head.next;
    }
}