import java.util.*;

public class Solution {
    public static int sortArray(int N, int[] A) {
        if (N == 1) {
            return 0;
        }

        int transitions = 0;

        // Traverse the array to count transitions
        for (int i = 1; i < N; i++) {
            if (A[i] < A[i - 1]) {
                transitions++;
            }
        }

        // The number of operations needed is equal to the number of transitions
        return transitions;
    }
}