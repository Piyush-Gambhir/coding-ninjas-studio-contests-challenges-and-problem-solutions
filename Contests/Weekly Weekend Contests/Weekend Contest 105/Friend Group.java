public class Solution {
    static int friendGroup(int n, int[] a) {
        // Write your code here.
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        if (oddCount > evenCount) {
            return oddCount;
        } else {
            return evenCount;
        }
    }
}