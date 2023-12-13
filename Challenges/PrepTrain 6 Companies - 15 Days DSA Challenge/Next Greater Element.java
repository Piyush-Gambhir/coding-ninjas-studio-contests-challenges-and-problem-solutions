import java.util.Stack;

public class Solution {
    public static int[] nextGreaterElement(int[] arr, int n) {
        int[] ans = new int[n];
        Stack<Integer> s = new Stack<Integer>();
        for (int i = n - 1; i >= 0; i--) {
            while (!s.empty() && arr[i] >= s.peek()) {
                s.pop();
            }
            if (!s.empty()) {
                ans[i] = s.peek();
            } else {
                ans[i] = -1;
            }
            s.push(arr[i]);
        }
        return ans;
    }
}