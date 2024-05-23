public class Solution {
    static int checkSequence(int a, int d, int x) {
        // Write your code here.
        if (d == 0) {
            return a == x ? 1 : 0;
        }

        int n = ((x - a) / d) + 1;
        return n > 0 ? 1 : 0;
    }
}