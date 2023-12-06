https://www.codingninjas.com/studio/problems/sort-0-1-2_631055?interviewProblemRedirection=true&count=25&page=1&search=&sort_entity=company_count&sort_order=DESC&leftPanelTabValue=SUBMISSION
import java.util.*;
import java.io.*;

public class Solution {

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
     
    }

    public static void sort012(int[] arr) {
        // Write your code here
        int n = arr.length;
        int i = 0;
        int j = 0;
        int k = n - 1;

        while (i <= k) {
            if (arr[i] == 0) {
                swap(arr, i, j);
                i++;
                j++;
            } else if (arr[i] == 1) {
                i++;
            } else {
                swap(arr, i, k);
                k--;
            }
        }
    }
}