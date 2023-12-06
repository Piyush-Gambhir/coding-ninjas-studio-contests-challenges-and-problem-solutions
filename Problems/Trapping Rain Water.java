/*
Problem Link: https://www.codingninjas.com/studio/problems/trapping-rainwater_630519?interviewProblemRedirection=true&count=25&page=1&search=&sort_entity=company_count&sort_order=DESC&leftPanelTabValue=PROBLEM
*/

public class Solution {
    public static long getTrappedWater(long[] arr, int n) {
        // Write your code here.
        long[] left = new long[n];
        long[] right = new long[n];

        left[0] = arr[0];
        right[n - 1] = arr[n - 1];

        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }

        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], arr[i]);
        }

        long trappedWater = 0;

        for (int i = 0; i < n; i++) {
            trappedWater += Math.min(left[i], right[i]) - arr[i];
        }

        return trappedWater;

    }
}