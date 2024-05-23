import java.util.*;

public class Solution {

    public static String isFlexible(int n, int[] arr) {
        if (n < 2) {
            return "NO";
        }

        int i = 0;

        while (i < n - 1 && arr[i] < arr[i + 1]) {
            i++;
        }

        int j = i;
        while (j < n - 1 && arr[j] == arr[j + 1]) {
            j++;
        }

        if (i == j) {
            return "NO";
        }

        while (j < n - 1 && arr[j] > arr[j + 1]) {
            j++;
        }

        if (j == n - 1) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
