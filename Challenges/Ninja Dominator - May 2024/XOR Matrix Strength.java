/*
Problem statement
You are given a 2D binary matrix 'A' with 'N' rows and 'N' columns. A binary matrix is a matrix where all elements are either 0 or 1. The strength of the matrix is defined as the sum of all the elements.

You are allowed to perform an operation on the matrix in which you must choose a row and then perform the XOR operation on all the elements of that row by 1. More formally, you must pick an integer 'i' between 0 and 'N - 1' inclusive and then perform 'A[i][j] = A[i][j] ^ 1' for every 'j' from 0 to 'N - 1' (^ denotes the bitwise XOR operation).

Your task is to return the number of unique strengths that can be produced after performing the given operation an arbitrary number of times (possibly 0).

For Example :
Let's say 'N' = 2, 'A' = {{0, 0}, {1, 1}}
Initially, the matrix has strength = 2.
If we perform the operation once with 'i = 1', we end up with the matrix {{1, 1}, {1, 1}} which has strength = 4.
If we perform the operation once with 'i = 2', we end up with the matrix {{0, 0}, {0, 0}} which has strength = 0.
If we perform the operation two times, once with 'i = 1' and once with 'i = 2', we end up with the matrix {{1, 1}, {0, 0}} which has strength = 2.
We can produce three different strengths 0, 2, and 4. Thus, the answer is 3.
*/

import java.util.*;

public class Solution {
    public static int countUniqueStrengths(int[][] a) {
        int n = a.length;
        int initialStrength = 0;
        int[] rowSums = new int[n];

        // Calculate initial strength and row sums
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                initialStrength += a[i][j];
                rowSums[i] += a[i][j];
            }
        }

        Set<Integer> uniqueStrengths = new HashSet<>();
        uniqueStrengths.add(initialStrength);

        // Explore all combinations of row flips
        for (int mask = 0; mask < (1 << n); mask++) {
            int newStrength = initialStrength;
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    newStrength = newStrength - rowSums[i] + (n - rowSums[i]);
                }
            }
            uniqueStrengths.add(newStrength);
        }

        return uniqueStrengths.size();
    }
}