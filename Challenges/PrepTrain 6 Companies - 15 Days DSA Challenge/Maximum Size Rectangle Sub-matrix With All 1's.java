import java.util.*;

public class Solution {
    public static int maximalAreaOfSubMatrixOfAll1(int[][] mat, int n, int m) {
        int[][] heights = new int[n][m];
        for (int j = 0; j < m; j++) {
            heights[0][j] = mat[0][j];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1) {
                    heights[i][j] = heights[i - 1][j] + 1;
                }
            }
        }
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            maxArea = Math.max(maxArea, maxAreaInHistogram(heights[i]));
        }
        return maxArea;
    }

    private static int maxAreaInHistogram(int[] heights) {
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? 0 : stack.peek() + 1;
            stack.push(i);
        }
        stack.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n - 1 : stack.peek() - 1;
            stack.push(i);
        }
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = right[i] - left[i] + 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}