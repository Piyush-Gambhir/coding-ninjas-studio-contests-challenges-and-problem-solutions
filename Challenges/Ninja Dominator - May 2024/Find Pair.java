public class Solution {
    static int[] findPair(int x, int y) {
        // Write your code here.

        double a = (x + y) / 2.0;
        double b = (x - y) / 2.0;

        // Check if a and b are integers
        if (isInteger(a) && isInteger(b)) {
            return new int[] { (int) a, (int) b };
        } else {
            return new int[] { -1, -1 };
        }
    }

    static boolean isInteger(double n) {
        return n == (int) n;
    }
}