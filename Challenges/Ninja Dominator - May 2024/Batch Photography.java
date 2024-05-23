import java.util.*;

public class Solution {

    public static boolean check(int error, int n, int k, int[] photos) {
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;

        if (photos[k] - photos[1] <= error) {
            dp[k] = true;
        } else {
            return false;
        }

        int curr = 1;

        for (int i = k + 1; i <= n; i++) {
            while (curr <= n && photos[i] - photos[curr] > error) {
                curr += 1;
            }
            while (curr <= n && !dp[curr - 1]) {
                curr += 1;
            }
            if (curr <= i - k + 1) {
                dp[i] = true;
            }
        }
        return dp[n];
    }

    public static int photography(int n, int k, int[] photos) {

        int[] newPhotos = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            newPhotos[i] = photos[i - 1];
        }
        Arrays.sort(newPhotos);

        int left = 0, right = newPhotos[n] - newPhotos[1];
        int ans = right;

        while (left <= right) {
            int mid = (left + right) / 2;
            int error = mid;
            if (check(error, n, k, newPhotos)) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
