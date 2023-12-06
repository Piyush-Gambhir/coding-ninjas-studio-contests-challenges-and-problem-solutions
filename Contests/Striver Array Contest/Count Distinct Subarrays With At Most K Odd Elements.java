import java.util.HashMap;

public class Solution {
    public static int distinctSubKOdds(int[] arr, int k) {
        int c = 0;
        int ans = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1)
                c++;
            if (c == k)
                ans++;
            if (mp.containsKey(c - k)) {
                ans += mp.get(c - k);
            }
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }
        return ans;
    }
}
