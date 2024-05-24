/*
Problem statement
Oggy and Cockroaches are playing a game. 'N' cockroaches are hidden inside the holes in a straight line numbered from 1, 2,.., 'N'(i.e. 'i'th cockroach is present at coordinate 'i' where 0 < 'i' <= 'N'). At the time 't', the cockroach at position 'X[t]' comes out of the hole with 'A[t]' coins where 0 < 't' <= 'N'. Initially, at time 't' = 0, Oggy is at coordinate 0 and has 0 coins. Each second, he can remain idle or move only to its adjacent coordinates.

Oggy can collect the coins from 'i'th cockroach only if he is at the coordinate 'i' exactly when it appears.

You can assume that no time is taken to collect the coins.

Return a number 'C' denoting the maximum number of coins Oggy can collect.

Note: Assume 1-based indexing.

For example:
Let 'N' = 5, 'X' = [1, 2, 4, 3, 5] and 'A' = [20, 0, 10, 0, 1]. 
Oggy moves to position 1 and collects 'A[1]' coins at time t = 1. Then, Oggy will move to position 5, which takes 4 seconds. So, at time t = 5, he will collect 1 coin. In total, he will be able to collect 21 coins. 
Hence, the answer will be 21.
*/
import java.util.*;

public class Solution {
    static int maxCoin(int n, int[] x, int[] a) {
        int[][] events = new int[n][2];
        for (int i = 0; i < n; i++) {
            events[i][0] = x[i];
            events[i][1] = a[i];
        }

        int[] dp = new int[n + 1]; // dp[i] represents the maximum coins collected by time i
        Arrays.fill(dp, Integer.MIN_VALUE);
        dp[0] = 0; // Oggy starts at coordinate 0 with 0 coins

        for (int t = 0; t < n; t++) {
            int[] newDp = new int[n + 1];
            Arrays.fill(newDp, Integer.MIN_VALUE);
            for (int i = 0; i <= n; i++) {
                if (dp[i] != Integer.MIN_VALUE) {
                    // Oggy can stay in the same position
                    newDp[i] = Math.max(newDp[i], dp[i]);

                    // Oggy can move to the left or right if within bounds
                    if (i > 0) newDp[i - 1] = Math.max(newDp[i - 1], dp[i]);
                    if (i < n) newDp[i + 1] = Math.max(newDp[i + 1], dp[i]);
                }
            }
            // Collect coins if at the right position
            int pos = events[t][0];
            int coins = events[t][1];
            if (newDp[pos] != Integer.MIN_VALUE) {
                newDp[pos] += coins;
            }
            dp = newDp; // Update dp to newDp for the next iteration
        }

        int maxCoins = 0;
        for (int i = 0; i <= n; i++) {
            maxCoins = Math.max(maxCoins, dp[i]);
        }

        return maxCoins;
    }
}