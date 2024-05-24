import java.util.*;

public class Solution {
    static int happyPrincipal(int[] a) {
        Arrays.sort(a);
        int n = a.length;
        int happyCount = 0;

        // Create a new array to hold the optimal arrangement
        int[] b = new int[n];

        // Use two pointers to arrange elements
        int left = 0;
        int right = (n + 1) / 2;

        // Place elements from the sorted array into the new array alternately
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                b[i] = a[left++];
            } else {
                b[i] = a[right++];
            }
        }

        // Calculate the number of happy moments
        for (int i = 1; i < n; i++) {
            if (b[i] > b[i - 1]) {
                happyCount++;
            }
        }

        return happyCount;
    }
}
