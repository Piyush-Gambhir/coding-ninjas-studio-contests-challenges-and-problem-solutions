public class Solution {
    static int maximumRemovals(int n, int[] v) {
        // Write your code here.
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        int maxIndex = -1;
        for (int i = 0; i < n; i++) {
            if (max < v[i]) {
                max = v[i];
                maxIndex = i;
            }
            if (min > v[i]) {
                min = v[i];
                minIndex = i;
            }

        }
        return n - Math.max(minIndex, maxIndex) - 1;
    }
}