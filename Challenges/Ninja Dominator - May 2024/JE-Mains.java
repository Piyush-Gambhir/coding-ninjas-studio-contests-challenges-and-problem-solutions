public class Solution {
    public static int badMemories(long n, long x) {
        for (long c = 0; c <= n; c++) {
            long w = 4 * c - x;
            if (w >= 0 && c + w <= n) {
                return 1;
            }
        }
        return 0;
    }
}
