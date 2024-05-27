/*
Problem statement
Ninja is given an array 'A' of size 'N'. Each element of the array represents the height of the 'ith' building (from left to right). He can choose any of the buildings. From that building, he wants to see the sunrise from the left of the first building.

He has some magical powers. By using them, he can increase the height of any building by 1. In the end, he wants to know the minimum number of times he needs to use the magic so that he can see the sunrise from any of the buildings.

For example:
Let's say 'N' = 3, 'X' = {2, 1, 2}. 
If he uses the magic once to increase the height of the second building, then the array will be {2, 2, 2} and in this scenario, he can see the sunrise from any of the buildings. 
Hence, he needs to use the magic only '1' time.
*/

import java.util.*;
import java.io.*;

public class Solution {

    public static long sunrise(int[] a) {
        long max_height = a[0];
        long magic_needed = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] < max_height) {
                magic_needed += max_height - a[i];
            } else {
                max_height = a[i];
            }
        }

        return magic_needed;
    }
}