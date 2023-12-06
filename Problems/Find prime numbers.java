import java.util.*;

public class Solution {

    public static ArrayList<Integer> primeNumbersTillN(int N) {
        boolean[] isPrime = new boolean[N + 1];
        Arrays.fill(isPrime, true);

        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) {
                ans.add(i);
            }
        }

        return ans;
    }
}
