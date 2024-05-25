
/*
In a computer game, you are faced with 'N' obstacles. The 'ith' obstacle has a durability of 'A[i]' and is considered to be intact if 'A[i] > 0.'

You can perform 2 types of operations:

1) Remove 1 point of durability from any single intact obstacle of your choice
2) Remove 1 point of durability from all intact obstacles. If after performing this action, at least one obstacle is completely removed (reaches 0 durability points), then this operation would be automatically repeated at no additional cost (this would continue repeating while at least one obstacle is completely removed every time).


Operations of type 1 can be performed any number of times, while an operation of type 2 can be performed at most once during the game.

What is the smallest number of times you need to perform operations of type 1 to remove all obstacles?

Example :
Input: ‘N’ = 3, ‘A’ = [3, 1, 2]
Output: 0

For this test case, perform operation type 2 once, and all obstacles will be removed, so no operations of type 1 are needed.
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 10^5
1 ≤ A[i] ≤ ‘N’
It is guaranteed that the sum of 'N' is ≤ 10^3 over all test cases.

Time limit: 1 sec
Sample Input 1:
2
3
3 1 2
6
4 1 5 4 1 1
Sample Output 1 :
0
4
Explanation For Sample Input 1:
For test case 1:
Perform operation type 2 once, and all obstacles will be removed, so no operations of type 1 are needed.

For test case 2:
Perform operation type 2 three times, then perform operation type 1 four times on the remaining obstacles with durability greater than 3.
Sample Input 2:
2
6
1 1 1 1 1 1
6
6 5 4 3 2 1
Sample Output 2 :
0
0
*/

public class Solution {

    static long minOperations(int n, int[] a) {
        // Write your code here.

    }
}