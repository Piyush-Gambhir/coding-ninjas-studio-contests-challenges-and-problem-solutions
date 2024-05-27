/*
Problem statement
Ninja is a brilliant student in the class and hence his teacher assigned him a problem.

He has been given an array ‘A’ containing ‘N’ integers from 0 to ‘N - 1’ exactly once.

He has been asked to calculate the number of elements in this array whose 1’s complement is odd. 1's complement of a binary number is another binary number obtained by toggling all bits. We first convert a number into its binary form then invert all the bits in it and then convert the resulting binary number into the decimal again to get its 1’s complement.

Your task is to help Ninja to find the number of elements in the given input array having odd 1’s complement.

Here 32 bits signed integers are considered to calculate the 1’s complement.

Example :
Input: ‘N’ = 3, ‘A’ = [1, 0, 2]
Output: 2

In the given array ‘A’ 1’s complement of [1, 0, 2] is [-2, -1, -3] out of them -1 and -3 are odd hence the answer is 2.
*/

public class Solution {
    static int oddComplement(int n, int[] a) {
        int count = 0;
        for (int num : a) {
            int complement = ~num;
            if (complement % 2 != 0) {
                count++;
            }
        }
        return count;
    }
}
