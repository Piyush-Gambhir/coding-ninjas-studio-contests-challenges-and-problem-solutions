import java.util.*;
import java.io.*;

public class Solution {
    static int chocPrice(int n) {
        // Write your code here
        int discountedChoc = n / 5;
        int remainingChoc = n % 5;
        int totalChocPrice = discountedChoc * 2 + remainingChoc * 10;

        return totalChocPrice;
    }
}