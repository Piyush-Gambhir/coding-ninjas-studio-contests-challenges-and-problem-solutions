public class Solution {
    static int[][] maximumInMatrices(int n, int m, int r, int s, int[][] a) {
        int[][] result = new int[n][m];

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                int maxVal = a[i][j];

                for (int k = i; k < Math.min(i + r, n); ++k) {
                    for (int l = j; l < Math.min(j + s, m); ++l) {
                        maxVal = Math.max(maxVal, a[k][l]);
                    }
                }

                result[i][j] = maxVal;
            }
        }

        return result;
    }
}