import java.util.*;

public class Solution {

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;

        int low = 0;
        int high = n - 1;
        int mid = 0;

        while (low <= high) {
            mid = (low + high) / 2;

            if (arr.get(mid) == k) {
                ans[0] = mid;
                high = mid - 1;
            } else if (arr.get(mid) > k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        low = 0;
        high = n - 1;
        mid = 0;

        while (low <= high) {
            mid = (low + high) / 2;

            if (arr.get(mid) == k) {
                ans[1] = mid;
                low = mid + 1;
            } else if (arr.get(mid) > k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
};
