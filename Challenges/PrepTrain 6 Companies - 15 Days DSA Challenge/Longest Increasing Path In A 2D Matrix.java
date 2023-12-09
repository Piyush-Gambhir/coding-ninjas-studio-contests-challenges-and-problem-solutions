import java.util.*;
import java.io.*;

public class Solution {
    public static int longestIncreasingPath(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        int max = Integer.MIN_VALUE;
        int[][] memo = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                max = Math.max(max, slv(i, j, -1, mat, memo));
            }
        }
        return max;
    }

    private static int slv(int i, int j, int prev, ArrayList<ArrayList<Integer>> mat, int[][] memo) {
        if (isInvalid(i, j, mat) || mat.get(i).get(j) <= prev)
            return 0;
        if (memo[i][j] != 0)
            return memo[i][j];
        int max = 1;
        int[][] directions = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
        for (int[] direction : directions) {
            int x = i + direction[0], y = j + direction[1];
            max = Math.max(max, 1 + slv(x, y, mat.get(i).get(j), mat, memo));
        }
        return memo[i][j] = max;
    }

    private static boolean isInvalid(int i, int j, ArrayList<ArrayList<Integer>> mat) {
        return i < 0 || i >= mat.size() || j < 0 || j >= mat.get(0).size();
    }
}