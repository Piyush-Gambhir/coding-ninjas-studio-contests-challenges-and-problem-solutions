
import java.util.*;

public class Solution {
    public static int kthSmallest(int n, int k, int[] arr) {
        // Write your code here.
        Arrays.sort(arr);
        return arr[k - 1];
    }
}
