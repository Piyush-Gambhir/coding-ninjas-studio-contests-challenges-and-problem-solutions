public class Solution {
    static int apple(int[] a) {
        // Write your code here.
        int maxDelicious = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxDelicious) {
                maxDelicious = a[i];
            }
        }
        return maxDelicious;
    }
}