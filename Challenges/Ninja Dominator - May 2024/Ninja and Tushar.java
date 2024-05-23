import java.util.Arrays;

public class Solution {
    static int findDifference(int[] v) {
        Arrays.sort(v);
        int n = v.length;
        int[] sortedV = new int[n];
        for (int i = 0; i < n; i++) {
            sortedV[i] = v[n - 1 - i];
        }

        int ninjaPower = 0;
        int tusharPower = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                ninjaPower += sortedV[i];
            } else {
                tusharPower += sortedV[i];
            }
        }

        return ninjaPower - tusharPower;
    }
}
