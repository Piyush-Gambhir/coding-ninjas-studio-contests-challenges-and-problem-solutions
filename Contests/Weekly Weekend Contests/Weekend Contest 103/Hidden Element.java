import java.util.*;

public class Solution {
    static int findHiddenElement(int n, int[] a) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            set.add(i);
        }
        int last = 0, y = 0;
        for (int i : a) {
            if (i != -1) {
                int x = i - last;
                set.remove(x);
                last = i;
            } else {
                y = last;
                last = 0;
            }
        }
        return y + set.iterator().next();
    }
}