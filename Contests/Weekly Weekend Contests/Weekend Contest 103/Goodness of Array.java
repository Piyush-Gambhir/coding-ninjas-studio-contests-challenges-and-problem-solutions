public class Solution {
    static int[] goodnessOfArray(int n, int m, int[] a, int[] b) {
        // Write your code here.

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int max = Integer.MIN_VALUE;
            int value = a[i];
            for (int j = 0; j < m; j++) {
                if (max < (value % b[j])) {
                    max = value % b[j];
                }
            }
            result[i] = max;
        }
        return result;
    }
}