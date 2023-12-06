import java.util.*;

public class Solution {

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;

        int left = 0;
        int right = n - 1;
        int mid = 0;

        while (left <= right) {
            mid = (left + right) / 2;

            if (arr.get(mid) == k) {
                result[0] = mid;
                right = mid - 1;
            } else if (arr.get(mid) > k) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        left = 0;
        right = n - 1;
        mid = 0;

        while (left <= right) {
            mid = (left + right) / 2;

            if (arr.get(mid) == k) {
                result[1] = mid;
                left = mid + 1;
            } else if (arr.get(mid) > k) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;

    }
};
