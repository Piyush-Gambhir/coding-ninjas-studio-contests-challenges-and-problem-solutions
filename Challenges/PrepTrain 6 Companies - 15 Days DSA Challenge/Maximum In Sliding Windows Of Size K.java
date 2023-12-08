import java.util.*;
import java.io.*;

import java.util.ArrayList;

public class Solution {

    public static ArrayList<Integer> getMaximumOfSubarrays(ArrayList<Integer> nums, int k) {
        // Write your code here.

        int n = nums.size();
        int[] ans = new int[n - k + 1];
        Deque<Integer> dq = new LinkedList<>();

        int i = 0;
        for (; i < k; i++) {
            while (!dq.isEmpty() && nums.get(dq.peekLast()) <= nums.get(i)) {
                dq.removeLast();
            }
            dq.addLast(i);
        }

        for (; i < n; i++) {
            ans[i - k] = nums.get(dq.peekFirst());

            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.removeFirst();
            }

            while (!dq.isEmpty() && nums.get(dq.peekLast()) <= nums.get(i)) {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        ans[i - k] = nums.get(dq.peekFirst());

        ArrayList<Integer> res = new ArrayList<>();
        for (int j = 0; j < ans.length; j++) {
            res.add(ans[j]);
        }
        return res;

    }
}