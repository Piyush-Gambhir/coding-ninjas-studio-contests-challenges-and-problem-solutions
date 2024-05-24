/*
Problem statement
Ninja is given an array 'A' of size 'N'. Where the 'ith' element represents the marks of the 'ith' student. Ninja is a depressed boy who always secures the last position in his class. He always compares himself with the topper, so he always wanted the gap between his and the topper's marks to be as minimum as possible. You being his good friend, this time you decided to help him.

To help ninja, you are going to reduce the gap between his (lowest marks among all students after all the operations) and the topper's marks (highest marks among all students after all the operations) before releasing the mark sheet for this, you can choose any two students, and you can increase the marks of the first student by '1' and then also decrease the marks of the second student by '1'. You can do this operation any number of times. In the end, return the gap between the ninja's marks and the topper's marks.

For example:

Let’s say N = 3 and A[] = {1,2,3}. 
Here if we choose the first and the third student and increase the marks of the first student by '1' and decrease the marks of the third student by '1'. Then the final array will be {2, 2, 2}. Now the topper's marks are '2' (highest among all), and the ninja's marks are '2' (lowest among all), So the gap between their marks is 2 - 2 = 0.
*/

import java.util.*;
import java.io.*;

public class Solution {

    public static int gap(int[] A) {
        int n = A.length;
        int total = 0;

        for (int mark : A) {
            total += mark;
        }

        int low = total / n;
        int high = low;

        int remainder = total % n;
        if (remainder != 0) {
            high = low + 1;
        }

        return high - low;
    }

}
