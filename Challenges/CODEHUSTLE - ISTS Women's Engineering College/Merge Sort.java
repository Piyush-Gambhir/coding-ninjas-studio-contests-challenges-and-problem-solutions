import java.util.*;

public class Solution {
    public static void mergeSort(int[] arr, int n) {
        // Write your code here.
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int j = mid; j < n; j++) {
            right[j - mid] = arr[j];
        }
        mergeSort(left, mid);
        mergeSort(right, n - mid);
        merge(arr, left, right, mid, n - mid);
    }

    public static void merge(int[] arr, int[] left, int[] right, int l, int r) {
        // Write your code here.
        int i = 0, j = 0, k = 0;
        while (i < l && j < r) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < l) {
            arr[k++] = left[i++];
        }
        while (j < r) {
            arr[k++] = right[j++];
        }
    }
}