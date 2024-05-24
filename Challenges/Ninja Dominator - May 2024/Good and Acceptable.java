/*
Problem statement
Bob is in love with Alice and wants to impress her. Alice has two arrays 'A' and 'B', both of size 'N'. Bob has an array 'C' of size 'N' initially equal to 'A'. Bob wants to maximize the 'Good' value of array 'C' so that Alice can get impressed. The 'Good' value of array 'C' is defined as the number of indices 'i' (0 < 'i' < 'N') where LCM('B[i]', 'C[i]') = GCD('B[i]', 'C[i]').

Bob has a special power that he can use any no of times on any element of array 'C'. Using his superpower he can replace any element of 'C' with any value. Alice imposed an additional constraint on Bob i.e. Array 'C' should have an 'Acceptance' value greater than or equal to the 'Acceptance' value of 'A'. The 'Acceptance' value of an array is defined as the maximum length subsequence having GCD greater than 1.

Return the maximum possible 'Good' value of array 'C' such that its acceptance value is greater than or equal to the 'Acceptance' value of 'A'.

Note : Assume 0-based indexing.

For example:
Let 'N' = 3, 'A' = [3, 2, 4], 'B' = [8, 3, 7]
The 'Acceptance' value of array 'A' is 2 as the longest subsequence having gcd greater than 1 consists of the second and third element i.e. [2, 4]. Therefore 'C' should have the 'Acceptance' value greater or equal to 2. one possible array 'C' having the maximum possible 'Good' value that can be formed after applying superpowers is [6, 3, 7]. Its acceptance value is 2. and its 'Good' value is also 2.
*/

public class Solution {
    static int findGoodValue(int n, int[] a, int[] b) {
        // Write your code here.

        
    }
}