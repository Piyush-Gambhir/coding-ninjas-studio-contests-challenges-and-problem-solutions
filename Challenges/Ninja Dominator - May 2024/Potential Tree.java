/*
Problem statement
You are given a tree consisting of 'N' vertices. Its root is not fixed yet.

The 'potential' of a non-leaf vertex is the count of its children with a non-zero 'potential'. The 'potential' of a leaf vertex 'i' is 'i % 2'.

Your task is to calculate the 'potential' of every possible root. Return an array 'A' such that 'A[ i ]' represents the 'potential' of vertex 'i' if the tree was rooted at 'i'.

For Example :
Let 'N' = 3, edges = [ [ 0, 1 ], [ 0, 2 ] ].
If the tree is rooted at vertex '0', vertices '1' and '2' are leaves, the potential of vertex '1' is '1', and vertex '2' is '0'. Thus the potential of vertex '0' is '1'.
If the tree is rooted at vertex '1', vertex '2' is the only leaf, and the potential of vertex '2' is '0'. Thus the potential of vertex '0' is '0', and further, the potential of vertex '1' is '0'.
If the tree is rooted at vertex '2', vertex '1' is the only leaf, and the potential of vertex '1' is '1'. Thus the potential of vertex '0' is '1', and further, the potential of vertex '2' is '1'.
Thus, the answer is [ '1, 0, 1' ].
*/

public class Solution {
    static int[] potentialTree(int n, int[][] edges) {
        // Write your code here.
    }
}