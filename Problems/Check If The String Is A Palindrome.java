/*
Problem Link: https://www.codingninjas.com/studio/problems/check-if-the-string-is-a-palindrome_1062633?interviewProblemRedirection=true&count=25&page=3&search=&sort_entity=company_count&sort_order=DESC&leftPanelTabValue=SUBMISSION&attempt_status=NOT_ATTEMPTED
*/

import java.util.*;
import java.io.*;

public class Solution {

    public static boolean checkPalindrome(String str) {

        // Remove special characters and whitespaces
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the cleaned string is a palindrome
        int left = 0;
        int right = cleanedStr.length() - 1;
        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}