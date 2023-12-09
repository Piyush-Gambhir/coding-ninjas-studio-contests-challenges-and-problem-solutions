import java.util.*;
import java.io.*;

public class Solution {

    public static int longestMountain(int arr[], int n) {
        // Write your code here.

        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = 1;
        dec[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                inc[i] = inc[i - 1] + 1;
            } else {
                inc[i] = 1;
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                dec[i] = dec[i + 1] + 1;
            } else {
                dec[i] = 1;
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (inc[i] > 1 && dec[i] > 1) {
                max = Math.max(max, inc[i] + dec[i] - 1);
            }
        }
        return max;
    }

}
