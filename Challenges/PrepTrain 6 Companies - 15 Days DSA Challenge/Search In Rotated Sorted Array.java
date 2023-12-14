import java.util.*;

public class Solution {
    public static int binarySearch(int[] arr, int si, int ei, int k) {
        while (si <= ei) {
            int mid = si + (ei - si) / 2;

            if (arr[mid] == k) {
                return mid;
            }

            if (arr[mid] > k) {
                ei = mid - 1;
            } else {
                si = mid + 1;
            }
        }

        return -1;

    }

    public static int search(int[] arr, int key) {
        int si = 0, ei = arr.length - 1;

        int pivot = 0, index;
        while (si <= ei) {
            int mid = si + (ei - si) / 2;

            if (arr[mid] < arr[0]) {
                pivot = mid;
                ei = mid - 1;
            } else {
                si = mid + 1;
            }
        }

        if (pivot == 0 || (key <= arr[arr.length - 1] && key >= arr[pivot])) {
            index = binarySearch(arr, pivot, arr.length - 1, key);
        } else {
            index = binarySearch(arr, 0, pivot - 1, key);
        }

        return index;

    }
}
