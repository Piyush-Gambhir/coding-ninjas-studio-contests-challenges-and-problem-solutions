public class Solution {
    public static double median(int[] a, int[] b) {
        // Write your code here.
        int n = a.length;
        int m = b.length;

        if (n > m) {
            return median(b, a);
        }

        int start = 0, end = n;

        while (start <= end) {
            int i1 = (start + end) / 2;
            int i2 = (n + m + 1) / 2 - i1;

            int min1 = (i1 == n) ? Integer.MAX_VALUE : a[i1];
            int max1 = (i1 == 0) ? Integer.MIN_VALUE : a[i1 - 1];

            int min2 = (i2 == m) ? Integer.MAX_VALUE : b[i2];
            int max2 = (i2 == 0) ? Integer.MIN_VALUE : b[i2 - 1];

            if (max1 <= min2 && max2 <= min1) {
                if ((n + m) % 2 == 0) {
                    return (Math.max(max1, max2) + Math.min(min1, min2)) / 2.0;
                } else {
                    return Math.max(max1, max2);
                }
            } else if (max1 > min2) {
                end = i1 - 1;
            } else {
                start = i1 + 1;
            }
        }

        return -1;
    }
}