import java.util.*;

public class Solution {
    static int maximumScore(int n, ArrayList<Integer> v) {
        Collections.sort(v);
        return v.get(n / 2) + v.get(0);
    }
}