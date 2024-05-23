import java.util.*;
import java.io.*;

public class Solution {

    static int possTasks(int n, int a, int b, int[] c) {
        Arrays.sort(c);

        if (a + b > n) {
            return 0;
        }

        return c[n - a] - c[b - 1];
    }
}
