/*
Problem statement
Ninja has been given a list ‘A’ of ‘N’ integers and in one move is allowed to remove any palindromic subarray in it. After removal of the subarray, the elements before and after it will join up and form the new array.

A palindromic subarray is a subarray that has the same element from any distance from both ends.

Ninja has been asked to find the minimum number of operations he has to perform to make the array ‘A’ empty.

Your task is to help and find the answer to the above problem.

Example :
Input: ‘N’ = 5, ‘A’ = [1, 3, 4, 1, 5]
Output: 3

First, we will remove [4] then will remove [1, 3, 1], and then [5] a total number of operations will be 3.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 ≤ T ≤ 10
1 ≤ N ≤ 100
-10^9 ≤ ‘A[i]’ ≤ 10^9
It is guaranteed that the sum of ‘N’ is ≤ 10^2 for all test cases.

Time limit: 1 sec
Sample Input 1 :
2
2
1 2
4
1 2 2 2
Sample Output 1 :
2
2
Explanation For Sample Input 1 :
For test case 1:    
First, we will remove [1] then will remove [2] the total number of operations will be 2.

For test case 2:
First, we will remove [1] then will remove [2, 2, 2] the total number of operations will be 2.
Sample Input 2 :
2
5
1 2 3 4 5
2
2 2
Sample Output 2 :
5
1

*/

import java.util.Scanner;

public class Solution {
    static int minimumOperations(int n, int[] a) {
        int[][] dp = new int[n][n];

        // Initialize the DP table for single element subarrays
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        // Fill the DP table for subarrays of length 2 to n
        for (int length = 2; length <= n; length++) {
            for (int i = 0; i <= n - length; i++) {
                int j = i + length - 1;
                if (a[i] == a[j]) {
                    if (i + 1 > j - 1) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                } else {
                    dp[i][j] = Integer.MAX_VALUE;
                    for (int k = i; k < j; k++) {
                        dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k + 1][j]);
                    }
                }
            }
        }

        // The answer for the full array is in dp[0][n-1]
        return dp[0][n - 1];
    }
}