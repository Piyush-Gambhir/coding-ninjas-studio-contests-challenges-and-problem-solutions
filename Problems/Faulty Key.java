import java.util.*;
import java.io.*;

public class Solution {
    public static int add(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }

    public static int getSum(int a, int b) {
        // Write your code here.
        return add(a, b);

    }
}