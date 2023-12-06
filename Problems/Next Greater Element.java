
/*
Problem Link: https://www.codingninjas.com/studio/problems/next-greater-element_630418?interviewProblemRedirection=true&count=25&page=2&search=&sort_entity=company_count&sort_order=DESC&leftPanelTabValue=PROBLEM
*/
import java.util.*;

public class Solution {
    public static int[] nextGreaterElement(int[] arr, int n) {
        // Write your code here.
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }

            st.push(arr[i]);
        }

        return ans;
    }
}