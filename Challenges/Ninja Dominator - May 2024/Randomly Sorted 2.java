/*
Problem statement
You are given a tree of 'N' vertices, rooted at vertex '0'. You assign a random number in the range '[0, M - 1]' to each of the vertices.



Let us define 'heap-like' as the property that: for all vertices 'v' in the subtree of any vertex 'u' of the tree, the random number assigned to vertex 'u' is less than or equal to the random number assigned to vertex 'v'.



Find the probability that the resulting tree is 'heap-like'.



The answer should be found modulo 10^9 + 7. Formally, let M = 10^9 + 7. It can be shown that the answer can be expressed as an irreducible fraction p/q, where p and q are integers and q !≡ 0 (mod M). Output the integer equal to p * (q^-1) mod M. In other words, output such an integer x that 0 <= x < M and x * q ≡ p (mod M).
*/

public class Solution {
    static int randomlySorted2(int n, int[][] edges, int m) {
        // Write your code here.
    }
}