import java.util.*;
import java.io.*;

public class Solution {
    public static int[] maxMinWindow(int[] arr, int n) {
        int INT_MIN = Integer.MIN_VALUE;

        int[] answer = new int[n];
        Arrays.fill(answer, INT_MIN);

        int[] next = nextSmaller(arr, n);
        int[] prev = previousSmaller(arr, n);

        for (int i = 0; i < n; i++) {
            int length = next[i] - prev[i] - 1;
            answer[length - 1] = Math.max(answer[length - 1], arr[i]);
        }

        for (int i = n - 2; i >= 0; i--) {
            answer[i] = Math.max(answer[i], answer[i + 1]);
        }

        return answer;
    }

    private static int[] previousSmaller(int[] arr, int n) {
        int[] prev = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                prev[i] = -1;
            } else {
                prev[i] = stack.peek();
            }

            stack.push(i);
        }

        return prev;
    }

    private static int[] nextSmaller(int[] arr, int n) {
        int[] next = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                next[i] = n;
            } else {
                next[i] = stack.peek();
            }

            stack.push(i);
        }

        return next;
    }
}
