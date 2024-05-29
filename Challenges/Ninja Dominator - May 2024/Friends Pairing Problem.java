/*
Problem statement
You are given an integer ‘N’, which denotes there are ‘N’ friends. You are supposed to form some pairs them satisfying the following conditions:

1. Each friend can be paired with some other friend or remain single.

2. Each friend can be a part of at most one pair.

You are supposed to find the total number of ways in which the pairing can be done satisfying both conditions. Since the number of ways can be quite large, you should find the answer modulo 1000000007(10^9+7).

Note:
1. Return the final answer by doing a mod with 10^9 + 7.
2. Pairs {A, B} and {B, A} are considered the same.
 */

import java.util.*;

public class Solution {
    public static int numberOfWays(int n) {
        final int MOD = 1000000007;
        if (n == 0)
            return 1;
        if (n == 1)
            return 1;

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = (int) ((dp[i - 1] + (long) (i - 1) * dp[i - 2] % MOD) % MOD);
        }

        return dp[n];
    }
}
