/*
Problem statement
You are given an array 'A' of length 'N' and 'Q' queries. Each query is denoted by two integers, 'L', and 'R'. The answer to a query is A[L]+('A[L]'^'A[L+1]')+('A[L]'^'A[L+1]'^'A[L+2]')+...+('A[L]'^'A[L+1]'^'A[R]').

Return the answer to each query.

For Example:-
Let 'N' = 4, 'Q' = 2,  'A' = [1, 7, 2, 6], and query = [[3, 4], [1, 3]].
A[3]+(A[3]^A[4]) = 6.
A[1]+(A[1]^A[2])+(A[1]^A[2]^A[3]) = 11.
*/

public class Solution {
    public static long[] answer(int n, int q, int[] a, int[][] queries) {
        int[] xorPrefix = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            xorPrefix[i] = xorPrefix[i - 1] ^ a[i - 1];
        }

        long[] results = new long[q];

        for (int k = 0; k < q; k++) {
            int L = queries[k][0] - 1;
            int R = queries[k][1] - 1;
            long result = 0;

            for (int i = L; i <= R; i++) {
                result += xorPrefix[i + 1] ^ xorPrefix[L];
            }

            results[k] = result;
        }

        return results;
    }
}
