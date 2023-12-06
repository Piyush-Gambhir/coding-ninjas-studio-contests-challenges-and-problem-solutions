/*
Problem Link: https://www.codingninjas.com/studio/problems/maximum-subarray-sum_628288?interviewProblemRedirection=true&count=25&page=3&search=&sort_entity=company_count&sort_order=DESC&leftPanelTabValue=PROBLEM
*/

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*
         * Your class should be named Main.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < n; i++) {
            currSum += arr[i];
            if (currSum > maxSum) {
                maxSum = currSum;
            }

            if (currSum < 0) {
                currSum = 0;
            }
        }

        System.out.println(maxSum);
    }

}