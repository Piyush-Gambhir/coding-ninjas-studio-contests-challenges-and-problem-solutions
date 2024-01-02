import java.util.*;

class solution {

    public static long solve(long N) {
        if (N <= 1) {
            return N;
        }
        int MOD = (int) 1e9 + 7;

        long a = 0, b = 1, c = 0;
        for (long i = 2; i <= N; i++) {
            c = (a + b) % MOD;
            a = b;
            b = c;
        }
        return b;

    }
}
