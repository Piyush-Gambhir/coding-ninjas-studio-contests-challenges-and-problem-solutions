import java.util.ArrayList;

public class Solution {
    static long countMaximumSum(int n, ArrayList<Integer> arr) {
        // Write your code here.
        int currentTotal = 0;
        for(int i = 0; i<arr.size(); i++){
            currentTotal += arr.get(i); 
        }

        return currentTotal;

    }
}