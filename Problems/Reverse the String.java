
/*
Problem Link: https://www.codingninjas.com/studio/problems/reverse-the-string_799927?interviewProblemRedirection=true&count=25&page=1&search=&sort_entity=company_count&sort_order=DESC&leftPanelTabValue=PROBLEM
*/
import java.util.*;
import java.io.*;

public class Solution {
    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }

        return new String(charArray);
    }
}
