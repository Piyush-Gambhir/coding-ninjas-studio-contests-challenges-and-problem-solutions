public class Solution {

    public static int longestIncreasingSubsequence(int arr[]) {
        int n = arr.length;
        int[] dp = new int[n];
        dp[0] = arr[0];
        int len = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] < dp[0]) {
                dp[0] = arr[i];
            } else if (arr[i] > dp[len - 1]) {
                dp[len] = arr[i];
                len++;
            } else {
                int index = binarySearch(dp, 0, len - 1, arr[i]);
                dp[index] = arr[i];
            }
        }

        return len;
    }

    private static int binarySearch(int[] arr, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}