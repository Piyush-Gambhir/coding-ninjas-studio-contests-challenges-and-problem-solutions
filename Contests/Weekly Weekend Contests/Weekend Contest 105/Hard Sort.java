public class Solution {
    static boolean sorted(int[] v) {
        int n = v.length - 1;
        for (int i = 0; i < n; i++) {
            if (v[i] > v[i + 1]) {
                return false;
            }
        }
        return true;
    }

    static int canYouSort(int n, int[] v) {
        // Write your code here.
        int X = 1;
        boolean sorted = false;

        while (true) {
            if (sorted(v)) {
                return 1;
            }
            sorted = false;
            for (int i = n - 1; i >= 0; i--) {
                if (v[i] == X) {
                    v[i] += X;
                    sorted = true;
                    break;
                }
            }
            if (!sorted) {
                break;
            }
            X++;
        }
        return 0;
    }
}