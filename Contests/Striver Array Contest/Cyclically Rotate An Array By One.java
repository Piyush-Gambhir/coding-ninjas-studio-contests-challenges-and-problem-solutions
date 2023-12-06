import java.util.*;
import java.io.*;

public class Solution {
    public static void rotate(ArrayList<Integer> arr, int n) {
        // Write your code here.
        int temp = arr.get(n - 1);
        for (int i = n - 1; i > 0; i--) {
            arr.set(i, arr.get(i - 1));
        }
        arr.set(0, temp);
    }
}