public class Solution {
    public static int[] findGood(int n, int[] x, int[] y) {
        int[] result = new int[n];

        int baseGCD = 0;
        for (int i = 1; i < n; i++) {
            baseGCD = gcd(baseGCD, Math.abs(x[i] - x[0]));
        }

        for (int i = 0; i < n; i++) {
            result[i] = gcd(baseGCD, Math.abs(x[0] - y[i]));
        }

        return result;
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
