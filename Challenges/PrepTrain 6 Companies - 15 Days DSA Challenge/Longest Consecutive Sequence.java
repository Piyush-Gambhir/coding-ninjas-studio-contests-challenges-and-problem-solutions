import java.io.*;
import java.util.*;

public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        // Write your code here.
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < N; i++)
            set.add(arr[i]);
        int max = 0;
        for (int i = 0; i < N; i++) {
            if (!set.contains(arr[i] - 1)) {
                int j = arr[i];
                while (set.contains(j))
                    j++;
                if (max < j - arr[i])
                    max = j - arr[i];
            }
        }

        return max;

    }
}