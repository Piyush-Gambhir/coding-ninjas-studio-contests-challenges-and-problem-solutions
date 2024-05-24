/*
Problem statement
Ninja is in search of happiness.

Ninja has ‘N’ integers in an array ‘ARR’, he wants to find the super score of the array ‘ARR’ to find happiness.

The super score of the array is defined as the sum of the scores of all subarrays in the array.

The score of a subarray is defined as the square of the minimum element in the array.

Can you find the Super score for the given array and help Ninja in finding happiness?

Example :
N = 3
ARR = [1 , 2 , 3]
The six subarrays and their respective scores are 
[ 1 ] 1,
[ 1 , 2 ] 1,
[ 1 , 2, 3 ] 1,
[ 2 ] 4,
[ 2, 3 ] 4,
[ 3 ] 9
The score of the array ‘ARR’ is ‘1 + 1 + 1 + 4 + 4 + 9’ = 20. 
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= T <= 10
1 <= N  <= 10^5
1 <= ARR[i] <= 1e3
Sum of N <= 10^5

Time Limit: 1 sec
Sample Input 1 :
2
4
1 2 3 4    
1
5
Sample Output 1 :
50
25
Explanation Of Sample Input 1 :
For test case 1, 
We will get, ‘1 * 1’ as ‘1’ from subarrays { [ 1 ], [ 1, 2 ], [ 1, 2, 3 ], [ 1, 2, 3. 4 ] } , ‘2 * 2’ as ‘4’ from { [ 2 ], [ 2, 3 ], [ 2, 3, 4 ] }, ‘3 * 3’ as ‘9’ { [ 3 ], [ 3, 4 ] } and ‘4 * 4’ { [ 4 ] }, so answer is 4 * 1 + 3 * 4 + 2 * 9 + 1 * 16 = 50.
For test case 2,
There is only one subarray ‘5 * 5’ so the answer is ‘25’. 
Sample Input 2 :
2
2 
4 4
3
0 3 0
Sample Output 2 :
48
9
*/

import java.util.*;
import java.io.*;

public class Solution {
    public static long superScore(int n, int[] arr) {
        long superScore = 0;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        stack.clear();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        for (int i = 0; i < n; i++) {
            long leftCount = i - left[i];
            long rightCount = right[i] - i;
            superScore += (long) arr[i] * arr[i] * leftCount * rightCount;
        }

        return superScore;
    }
}
