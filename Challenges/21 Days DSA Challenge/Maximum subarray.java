import java.util.*;
import java.io.*;

import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> maximumsumSubarray(int n, int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int localSum = 0;
        int start = 0;
        int end = 0;
        int newStart = 0;

        for (int i = 0; i < n; i++) {
            localSum = localSum + arr[i];

            if (localSum > maxSum) {
                maxSum = localSum;
                start = newStart;
                end = i;
            } else if (localSum == maxSum) {
                if (end - start < i - newStart) {
                    start = newStart;
                    end = i;
                }
            }
            if (localSum < 0) {
                localSum = 0;
                newStart = i + 1;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            ans.add(arr[i]);
        }

        return ans;

    }
}
