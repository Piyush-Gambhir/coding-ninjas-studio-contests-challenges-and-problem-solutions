
/*
Problem statement
There are 'N' houses on the left side of the road and 'N' houses on the right side. All of these houses are coloured. The colour of houses on the left and right sides is given by arrays 'A' and 'B', respectively.

Both the arrays 'A' and 'B' are permutations of length 'N'. A permutation of length 'N' is the sequence of length 'N', which consists of all the integers from 1 to 'N' exactly once.

For an 'i-th' house on the left side, you are supposed to find the house on the right side with the same colour as 'A[i]'.

Example :
'N' = 3, 'A' = {1, 2, 3}, 'B' = {2, 3, 1}.

House 1 on the left side has the same colour as house 3 on the right side.
House 2 on the left side has the same colour as house 1 on the right side.
House 3 on the left side has the same colour as house 2 on the right side.

The answer is {3, 1, 2}.
*/

public class Solution {
    public static int[] findTwinHouses(int[] a, int[] b, int n) {
        int[] colorPosition = new int[n];
        int[] twinPositions = new int[n];

        for (int i = 0; i < n; i++) {
            colorPosition[b[i] - 1] = i;
        }

        for (int i = 0; i < n; i++) {
            twinPositions[i] = colorPosition[a[i] - 1] + 1;
        }

        return twinPositions;
    }
}
