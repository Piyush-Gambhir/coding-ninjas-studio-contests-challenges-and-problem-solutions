
/*
Problem statement
Ninja is given an array ‘A’ of length ‘N’ consisting of positive integers. He can do an operation as many times as he wants. In one operation, he can select an integer ‘x’ and count all the occurrences of ‘x’ in the array ‘A’ and remove them. Then he will add all the removed integer ‘x’ either in the front or at the end of the array ‘A’. He wants to sort the array in non-decreasing order using the minimum number of operations.

For example:

Let’s say ‘A’ = [2, 1, 1, 2, 3, 1, 4, 3]. If we select ‘x’ = 1 and add all the ‘1’ in front then the updated array ‘A’ = [1, 1, 1, 2, 2, 3, 4, 3]. If we select ‘x’ = 4 and add all the ‘4’ in end then the updated array ‘A’ = [1, 1, 1, 2, 2, 3, 3, 4]. Hence the array become sorted in two operations.
 */

import java.util.*;

public class Solution {
    public static int sortArray(int N, int[] A) {
        // Create a TreeMap to store the frequency of each number
        TreeMap<Integer, Integer> map = new TreeMap<>();

        // Count the frequency of each number
        for (int num : A) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Create a PriorityQueue to store the numbers in descending order of frequency
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        pq.addAll(map.keySet());

        // Sort the array
        int i = 0;
        while (!pq.isEmpty()) {
            int num = pq.poll();
            int count = map.get(num);

            // Place the number in the array
            for (int j = 0; j < count; j++) {
                A[i++] = num;
            }

            // If the frequency becomes 0, remove the number from the map
            if (count == 0) {
                map.remove(num);
            }
        }

        // Return the number of operations (which is the size of the PriorityQueue)
        return pq.size();
    }
} 