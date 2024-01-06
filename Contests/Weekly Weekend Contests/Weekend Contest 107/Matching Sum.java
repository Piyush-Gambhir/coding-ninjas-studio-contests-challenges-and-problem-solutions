import java.util.ArrayList;

public class Solution {

    static int factorial(int n, int[] dp) {
        if (n == 0 || n == 1) {
            return 1;
        }
        dp[0] = 1;
        dp[1] = 1;

        if (dp[n] != -1) {
            return dp[n];
        }

        for (int i = 2; i <= n; i++) {
            dp[i] = (int) ((long) dp[i - 1] * i % 998244353);
        }
        return dp[n];

    }

    static int countRearrangements(int n, ArrayList<Integer> a) {
        // Write your code here.
        int positiveCount = 0;
        int negativeCount = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == 1) {
                positiveCount++;
            } else {
                negativeCount++;
            }
        }
        int max = Math.max(negativeCount, positiveCount);
        int min = Math.min(negativeCount, positiveCount);

        int[] dp = new int[max + 3];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        // int arrangementPositive = factorial(max, dp);
        // int arrangementNegatives = factorial(max, dp);
        long ans = (long) (factorial(max + 1, dp)) % 998244353 / ((factorial(min, dp)) * (factorial(max + 1 - min, dp)))
                % 998244353;
        return (int) ans % 998244353;
    }
}