import java.util.*;
import java.io.*;

public class Solution {
    public static int[] countEvenOdd(int[] arr, int n) {
        // Write your code here.
        int[] count = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>(map.values());

        for (int i = 0; i < map.size(); i++) {
            if (list.get(i) % 2 == 0) {
                count[1]++;
            } else {
                count[0]++;
            }

        }
        return count;
    }
}
