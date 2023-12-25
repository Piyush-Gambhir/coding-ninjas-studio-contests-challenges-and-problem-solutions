public class Solution {
    static int powerOfArray(int n, int k, int[] a) {
        // Write your code here.
        int maxPower = 0;
        int P = 0;
        int Q = 0;
        for (int i = 0; i < n; i++) {
            Q += a[i];
        }

        for (int i = 0; i < n; i++) {
            Q -= a[i];
            int power = P + a[i] * k + Q;
            P += a[i];
            if (maxPower < power) {
                maxPower = power;
            }
        }
        return maxPower;
    }
}