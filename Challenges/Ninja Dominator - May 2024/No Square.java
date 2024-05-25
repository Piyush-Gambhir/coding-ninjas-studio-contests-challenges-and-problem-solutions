/*
Problem statement
You are given an array 'A' of length 'N' ('A[i]' <= 'M'). You have to split 'A' into the minimum number of the continuous subarrays, such that in each subarray there are no two numbers whose product is a perfect square.

Return the minimum possible number of continuous subarrays that satisfies the condition and we can split 'A' in those.

For Example:-
Let 'N' = 5, 'M' = 8, 'A' = [2, 8, 1, 3, 4].
We can split 'A' in [2], [8, 1], [3, 4].
Our answer is 3.
*/

public class Solution {
    static int noSquare(int m, int[] a) {
        boolean[] dp = new boolean[m + 1];
        dp[0] = true;

        for (int i = 0; i < a.length; i++) {
            for (int j = m; j >= a[i]; j--) {
                if (dp[j - a[i]]) {
                    dp[j] = true;
                }
            }
        }

        int count = 0;
        for (int i = 1; i * i <= m; i++) {
            if (!dp[i * i]) {
                count++;
            }
        }

        return count;
    }
}