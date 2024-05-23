import java.util.*;
import java.io.*;

public class Solution {

    public static int gap(int[] v) {
  
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

        for (int mark : v) {
            if (mark < minVal) {
                minVal = mark;
            }
            if (mark > maxVal) {
                maxVal = mark;
            }
        }

        return maxVal - minVal;
    }
}