import java.util.*;

public class Solution {
    static int countMinimumDeletion(int n, int m, String s, ArrayList<Integer> time) {
        // Write your code here.
        int count = 0;
        for (int i = 0; i < time.size(); i++) {
            int t = time.get(i);
            if (t > 0 && t <= s.length() && s.charAt(t - 1) == '1') {
                count++;
                for (int j = i + 1; j < time.size(); j++) {
                    time.set(j, time.get(j) - 1);
                }

            }
        }
        return count;
    }
}