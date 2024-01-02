import java.io.*;
import java.util.*;

public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        // Write your code here.
        int max = 1;
        int count = 1;
        Arrays.sort(arr);
        for (int i = 1; i < N; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                count++;
            } else if (arr[i] == arr[i - 1]) {
                continue;
            } else {
                count = 1;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}