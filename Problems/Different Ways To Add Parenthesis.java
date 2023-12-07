

import java.util.*;
import java.io.*;

public class Solution {
    public static int[] diffWaysToCompute(String s) {
        // Write your code here.
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*') {
                String part1 = s.substring(0, i);
                String part2 = s.substring(i + 1);
                int[] part1ans = diffWaysToCompute(part1);
                int[] part2ans = diffWaysToCompute(part2);
                for (int p1 : part1ans) {
                    for (int p2 : part2ans) {
                        if (ch == '+') {
                            ans.add(p1 + p2);
                        } else if (ch == '-') {
                            ans.add(p1 - p2);
                        } else if (ch == '*') {
                            ans.add(p1 * p2);
                        }
                    }
                }
            }
        }
        if (ans.size() == 0) {
            ans.add(Integer.valueOf(s));
        }
        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }
        Arrays.sort(res);
        return res;

    }
}