import java.util.*;
import java.io.*;

public class Solution {

    public static int classTest(int n, int a[], int k) {

        // Write your code here.
        Arrays.sort(a);

        return a[n - k];
    }
}