
/*
Problem statement
There are 'N' basketball players, where 'ith' players have height 'H[i]'. There is an array of pairs' A' where a pair ('X', 'Y') (where 'X' and 'Y' are not the same) denotes that player 'X' has won against 'Y' in a match.

Let's define a sequence of winnings as 'S[1]', 'S[2]',..., 'S[k]', where each element denotes a player. In the sequence for all j (1 <= j < k) 'S[j]' has won a match against 'S[j+1]', if this condition is not followed the sequence is not called sequence of winnings.

Let's define sequence value as the maximum number of players with the same height in a winning sequence.

You have to determine the maximum possible sequence value. If any sequence starts and ends with the same player, print -1. Else, print the sequence value.

Example :
'N' = 5, 'M' = 4, 'H' = {1, 2, 1, 2, 3}, 'A' = { {1, 2}, {2, 3}, {4, 5}, {5, 3} }.

Sequences of length 1 : { {1}, {2}, {3}, {4}, {5} }. Sequence value = 1 as all the sequences have exactly one player with the same height.

Sequences of length 2 : { {1, 2}, {2, 3}, {4, 5}, {5, 3} }. Sequence value = 1 as all the sequences have at most 1 player with the same height.

Sequences of length 3 : { {1, 2, 3}, {4, 5, 3} }. Sequence value = 2 as the sequence {1, 2, 3} has two players 1 and 2 with the same height.

There are no sequences of length > 3.

So, we will print 2.
*/

import java.util.*;

public class Solution {

    static final int MAX_HEIGHT = 10;

    static int maxSequenceVal(int heights[], int edges[][], int numNodes, int numEdges) {
        List<List<Integer>> adjacencyList = new ArrayList<>(numNodes + 1);
        for (int i = 0; i <= numNodes; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        int[] inDegree = new int[numNodes + 1];
        int[][] dp = new int[numNodes + 1][MAX_HEIGHT + 1];

        for (int[] edge : edges) {
            int from = edge[0], to = edge[1];
            adjacencyList.get(from).add(to);
            inDegree[to]++;
        }

        Queue<Integer> queue = new ArrayDeque<>();

        for (int i = 1; i <= numNodes; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
                dp[i][heights[i - 1]]++;
            }
        }

        int processedNodes = 0;

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            processedNodes++;

            for (int nextNode : adjacencyList.get(currentNode)) {
                for (int j = 1; j <= MAX_HEIGHT; j++) {
                    dp[nextNode][j] = Math.max(dp[nextNode][j], dp[currentNode][j]);
                }
                inDegree[nextNode]--;

                if (inDegree[nextNode] == 0) {
                    queue.add(nextNode);
                    dp[nextNode][heights[nextNode - 1]]++;
                }
            }
        }

        if (processedNodes < numNodes) {
            return -1;
        }

        int maxSequenceValue = 0;
        for (int i = 1; i <= numNodes; i++) {
            for (int j = 1; j <= MAX_HEIGHT; j++) {
                maxSequenceValue = Math.max(maxSequenceValue, dp[i][j]);
            }
        }

        return maxSequenceValue;
    }
}
