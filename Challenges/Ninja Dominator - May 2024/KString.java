/*
Problem statement
You are given a binary string ‘S’ of length ‘N’ and an integer 'K'. String 'S' is called k-String if its length is divisible by 'K' and there is such string 'T' of length 'K', that 'S' is represented by string 'T' written exactly 'N' / 'K' times consecutively.

For the given string 'S', Return the minimum number of characters we have to change to make the string, k-String.

A Binary string is a string that consists only of characters '0' and '1'.

For Example:-
Let  N = 6, K = 3, S = "010111".
We can change the character at index 4 to '0' and 6 to '0' (1-based indexing).
The String 'S' becomes "010010", which is a k-String.
The number of characters changed is 2.

*/

import java.util.* ;
import java.io.*; 
public class Solution {
  public static int kString(int k, String s) {
        int n = s.length();
        int segments = n / k;
        int changes = 0;

        for (int i = 0; i < k; i++) {
            int count0 = 0;
            int count1 = 0;
            
            // Count the number of '0's and '1's at each (i + m * k) position
            for (int j = 0; j < segments; j++) {
                if (s.charAt(i + j * k) == '0') {
                    count0++;
                } else {
                    count1++;
                }
            }

            // We need to change all characters to the majority character
            changes += Math.min(count0, count1);
        }

        return changes;
    }
}