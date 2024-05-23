import java.util.*;

public class Solution {

    static long maxSumHelper(int n, int[] a) {
        long initialSum = 0;
        for (int value : a) {
            initialSum += value;
        }

        long maxSum = initialSum;

        for (int i = 0; i < n; i++) {
            long newSum = 0;
            for (int j = 0; j <= i; j++) {
                newSum += a[i];
            }
            for (int j = i + 1; j < n; j++) {
                newSum += a[j];
            }
            if (newSum > maxSum) {
                maxSum = newSum;
            }
        }

        return maxSum;
    }
}
