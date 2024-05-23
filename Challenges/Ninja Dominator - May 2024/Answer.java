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
            int currentXor = 0;
            for (int i = L; i <= R; i++) {
                currentXor ^= a[i];
                result += currentXor;
            }
            results[k] = result;
        }

        return results;
    }
}
