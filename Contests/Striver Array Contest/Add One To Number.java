import java.util.*;
import java.io.*;

public class Solution {
    public static ArrayList<Integer> addOneToNumber(ArrayList<Integer> arr) {
        // Write your code here.
        int n = arr.size();
        int carry = 1;
        for (int i = n - 1; i >= 0; i--) {
            int sum = arr.get(i) + carry;
            arr.set(i, sum % 10);
            carry = sum / 10;
        }
        if (carry == 1) {
            arr.add(0, 1);
        }

        int i = 0;
        while (i < arr.size() && arr.get(i) == 0) {
            arr.remove(i);
        }

        return arr;
    }
}
