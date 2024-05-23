import java.util.*;
import java.io.*;

public class Solution {
    public static int makeItEven(int n, int arr[]) {
        // Write your code here.
        int oddCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }

        return oddCount;
    }
}