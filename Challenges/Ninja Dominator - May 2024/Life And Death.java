/*
Problem statement
Lord Death is bored. He decides to kill people based on the results of a certain game. He has an array 'V' of length 'N' and an integer 'A', he can do the following operations on the elements of 'V':

1. If the element is greater than '0', take 'X' lives and divide the element by '2' (rounding down).
2. At most once per element, take 'Y' lives and perform bitwise XOR of the element with 'A'.
Lord Death can do any number of operations as long as he follows the rules of the operations and after the last operation, the elements of 'V' are all even.

Lord Life wants to know what to expect. Your task is to return the maximum and minimum lives Lord Death can take.

For Example :
Let 'N' = 3, 'V' = [ '1, 0, 5' ], 'A' = 0, 'X' = 2, 'Y' = 10.

If Lord Death takes 'X' lives twice, once to divide 'V[ 0 ]' by 2 and then to divide 'V[ 2 ]' by 2, then the array becomes [ '0, 0, 2' ], so all the elements of 'V' are even.
It can be shown that these are the minimum lives that Lord Death has to take.

For the maximum, Taking bitwise XOR with 'A = 0' does not change the elements thus Lord Death can take Y lives three times, once for each element, and then divide each element until it reaches '0' taking a total of 4 * X more lives.

Thus, the maximum is '3 * Y + 4 * X = 38' and the minimum is '2 * X = 4'.
*/

/*
    Time Complexity: O(N * log(max(V)))
    Space Complexity: O(1)

    where 'N' is the length of the array 'V' and 'max(V)' is the maximum element of 'V'.
*/

public class Solution {

    static long maximize(int p, int x) {
        long cnt = 0;
        while (p > 0) {
            p /= 2;
            cnt++;
        }
        return cnt * x;
    }

    static long minimize(int p, int x) {
        long cnt = 0;
        while ((p & 1) > 0) {
            p /= 2;
            cnt++;
        }
        return cnt * x;
    }

    static long[] lifeAndDeath(int n, int[] v, int a, int x, int y) {
        long[] ans = new long[2];
        for (int i = 0; i < n; i++) {
            ans[0] += maximize(v[i], x);
            ans[1] += Math.min(minimize(v[i], x), y + minimize(v[i] ^ a, x));
        }
        ans[0] += (y + maximize(a, x)) * n;
        return ans;
    }
}
