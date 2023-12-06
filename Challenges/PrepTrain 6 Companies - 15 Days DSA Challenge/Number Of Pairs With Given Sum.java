import java.util.*;

public class Solution {
    public static long pairsWithGivenSum(int arr[], int sum) {
        // Your code goes here
        HashMap<Integer, Integer> map = new HashMap<>();
        long count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(sum - arr[i])) {
                count += map.get(sum - arr[i]);
            }
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        return count;
    }
}