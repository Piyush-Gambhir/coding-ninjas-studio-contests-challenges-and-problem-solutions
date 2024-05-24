/*
Problem statement
You are given a tree with 'N' vertices and an integer 'K'.

Define 'distance(u, v)' as the number of edges in the shortest path between 'u' and 'v'. Then, define Mod-Distance between 2 vertices 'u' and 'v' as 'distance(u, v) % K'.

You are given an array 'D' of length 'N', such that 'D[ i ]' represents the favorite Mod-Distance of vertex 'i'.

For each vertex, find the sum of all the vertices which are its favorite Mod-Distance away from it.

For Example :
Let 'N' = 5, 'K' = 3, edges = [ [ '0, 1' ], [ '1, 2' ], [ '2, 3' ], [ '0, 4' ] ], 'D' = [ '1, 2, 0, 1, 2' ].
Vertex '1' and '4' are at Mod-Distance '1' from vertex '0'. Thus the sum for vertex '0' is '1 + 4 = 5'.
Vertex '3' and '4' are at Mod-Distance '2' from vertex '1'. Thus the sum for vertex '1' is '3 + 4 = 7'.
Vertex '2' and '4' are at Mod-Distance '0' from vertex '2'. Thus the sum for vertex '2' is '2 + 4 = 6'.
Vertex '2' and '4' are at Mod-Distance '1' from vertex '3'. Thus the sum for vertex '3' is '2 + 4 = 6'.
Vertex '1' is at Mod-Distance '2' from vertex '4'. Thus the sum for vertex '4' is '1'.
Therefore, the answer is [ '5, 7, 6, 6, 1' ].
*/

import java.io.*;
import java.util.*;

public class Solution {
    static long[] modDistant(int n, int k, int[][] edges, int[] d) {
        // Write your code here.

    }
}