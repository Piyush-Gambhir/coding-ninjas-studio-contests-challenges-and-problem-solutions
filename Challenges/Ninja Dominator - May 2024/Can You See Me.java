/*
Problem statement
There are ‘N’ people standing in a row with heights given in an array ‘ARR’. Two people standing at indices ‘L’ and ‘R’ (‘L’ < ‘R’) can see each other if either of the following two holds:

a. ‘R’ = ‘L’ + 1  i.e, they are adjacent.
b. Max(‘ARR[L + 1]’, ‘ARR[L + 2]’, …, ‘ARR[R - 1]’) < Min(‘ARR[L]’, ‘ARR[R]’).
Example :
N = 4, ARR = [ 4, 3, 1, 2 ]
Here the pairs with indices [ 0, 1 ], [ 1, 2 ], [ 2, 3 ] can see each other as they are adjacent.
And the pair with indices [ 1, 3 ] can see each other because the person’s height at index 2 is smaller than both heights at index 1 and 3.
Therefore, only 4 pairs of people can see each other.
*/

public class Solution {
    public static int countPairs(int n, int[] arr) {
        // Write your code here.
    }

}
