import java.util.*;
import java.io.*;

public class Solution {

    public static final int MOD = 1000000007;

    public static long countDistinctWayToClimbStair(long nStairs) {
        if (nStairs == 0 || nStairs == 1)
            return 1;
        long dp[] = new long[(int) (nStairs + 1)];
        dp[0] = 1;
        dp[1] = 1;
        for (int currStep = 2; currStep <= nStairs; currStep++) {
            dp[currStep] = (dp[currStep - 1] + dp[currStep - 2]) % MOD;
        }
        return dp[(int) nStairs];
    }
}