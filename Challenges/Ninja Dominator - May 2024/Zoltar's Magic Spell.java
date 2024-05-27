/*
Problem statement
You are given a non-negative integer array 'A' of 'N' integers and a wizard named Zoltar who can perform magic operations on the array. In a single operation, Zoltar can:

Choose a positive integer 'X' such that 'X' is less than or equal to the smallest non-zero element in 'A'.
Use his mystical crystal ball to cast a spell that subtracts 'X' from every positive element in 'A'.
Return the minimum number of spells Zoltar must cast to make every element in 'A' equal to '0' and save the kingdom from the evil sorcerer who cursed the array.

Example :
Input: 'N' = 4, 'A' = [ 2, 2, 3, 7 ]
Output: 3

Zoltar performs the following operations:
1. Choose 'X = 2' and subtract 'X' from every positive element in 'A', resulting in [ 0, 0, 1, 5 ].
2. Choose 'X = 1' and subtract 'X' from every positive element in 'A', resulting in [ 0, 0, 0, 4 ].
3. Choose 'X = 4' and subtract 'X' from every positive element in 'A', resulting in [ 0, 0, 0, 0 ].
*/

public class Solution {
    private static boolean checkZero(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                return false;
            }
        }
        return true;
    }

    static int minimumSpells(int n, int[] a) {
        // Write your code here.
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                min = Math.min(min, a[i]);
            }
        }

        int count = 0;
        while (!checkZero(a)) {
            for (int i = 0; i < n; i++) {
                if (a[i] != 0) {
                    a[i] -= min;
                }
            }
            count++;
            min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (a[i] != 0) {
                    min = Math.min(min, a[i]);
                }
            }
        }

        return count;
    }
}