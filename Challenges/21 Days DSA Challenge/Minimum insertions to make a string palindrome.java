import java.util.*;

public class Solution {
    public static int minInsertion(String str) {
        // Write your code here.
        int n = str.length();
        int table[][] = new int[n][n];
        int l, h, gap;

        for (gap = 1; gap < n; ++gap) {
            for (l = 0, h = gap; h < n; ++l, ++h) {
                table[l][h] = (str.charAt(l) == str.charAt(h)) ? table[l + 1][h - 1]
                        : (Math.min(table[l][h - 1], table[l + 1][h]) + 1);
            }
        }

        return table[0][n - 1];
    }
}