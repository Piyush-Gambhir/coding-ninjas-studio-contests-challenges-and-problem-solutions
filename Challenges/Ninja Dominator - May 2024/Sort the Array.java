
/*
Problem statement
Ninja is given an array ‘A’ of length ‘N’ consisting of positive integers. He can do an operation as many times as he wants. In one operation, he can select an integer ‘x’ and count all the occurrences of ‘x’ in the array ‘A’ and remove them. Then he will add all the removed integer ‘x’ either in the front or at the end of the array ‘A’. He wants to sort the array in non-decreasing order using the minimum number of operations.

For example:

Let’s say ‘A’ = [2, 1, 1, 2, 3, 1, 4, 3]. If we select ‘x’ = 1 and add all the ‘1’ in front then the updated array ‘A’ = [1, 1, 1, 2, 2, 3, 4, 3]. If we select ‘x’ = 4 and add all the ‘4’ in end then the updated array ‘A’ = [1, 1, 1, 2, 2, 3, 3, 4]. Hence the array become sorted in two operations.
 */
import java.util.*;

public class Solution {
    public static int sortArray(int N, int[] A) {
        // Step 1: Find the length of the longest sorted prefix
        int longestSortedPrefixLength = 1;
        for (int i = 1; i < N; i++) {
            if (A[i] >= A[i - 1]) {
                longestSortedPrefixLength++;
            } else {
                break;
            }
        }

        // Step 2: Collect the rest of the elements after the longest sorted prefix
        Set<Integer> uniqueElements = new HashSet<>();
        for (int i = longestSortedPrefixLength; i < N; i++) {
            uniqueElements.add(A[i]);
        }

        // Step 3: The number of operations needed is equal to the size of the set of
        // unique elements
        return uniqueElements.size();
    }
}
