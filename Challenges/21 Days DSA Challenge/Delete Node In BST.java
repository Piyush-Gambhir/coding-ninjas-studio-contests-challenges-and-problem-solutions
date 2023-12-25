
/*********************************************************

 Following is the BinaryTreeNode structure:

 class BinaryTreeNode<T> {
     T data;
     BinaryTreeNode<T> left;
     BinaryTreeNode<T> right;
     BinaryTreeNode() {
         this.data = null;
         this.left = null;
         this.right = null;
     }
     BinaryTreeNode(T data) {
         this.data = data;
         this.left = null;
         this.right = null;
     }
     BinaryTreeNode(T data, BinaryTreeNode<T> left, BinaryTreeNode<T> right) {
         this.data = data;
         this.left = left;
         this.right = right;
     }
 };
 ********************************************************/

import java.util.*;

public class Solution {
    public static BinaryTreeNode<Integer> deleteNode(BinaryTreeNode<Integer> root, int key) {
        // Write your code here.
        if (root == null) {
            return null;
        }

        if (root.data == key) {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                BinaryTreeNode<Integer> minNode = root.right;
                while (minNode.left != null) {
                    minNode = minNode.left;
                }
                root.data = minNode.data;
                root.right = deleteNode(root.right, minNode.data);
                return root;
            }
        } else if (root.data < key) {
            root.right = deleteNode(root.right, key);
            return root;
        } else {
            root.left = deleteNode(root.left, key);
            return root;
        }
    }
}