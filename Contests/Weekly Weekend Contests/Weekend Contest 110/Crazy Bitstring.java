import java.util.*;

public class Solution {
    static long crazyBitstring(int n, String s, ArrayList<Integer> a) {
        int one = 0, zero = 0;
        for (char ch : s.toCharArray()) {
            one += ch == '1' ? 1 : 0;
        }
        if (one == 0) {
            return 0;
        }
        zero = n - one;

        ArrayList<Integer> ve = new ArrayList<>();
        ArrayList<Integer> vi = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                vi.add(a.get(i));
            } else {
                ve.add(a.get(i));
            }
        }

        Collections.sort(ve);
        Collections.sort(vi);

        if (one > zero) {
            long sumVi = 0;
            for (int i = 0; i < vi.size(); i++) {
                sumVi += vi.get(i);
            }
            long sumVe = 0;
            for (int i = 0; i < zero; i++) {
                sumVe += ve.get(i);
            }
            return Math.min(sumVi, sumVe);
        } else {
            long sumVe = 0;
            for (int i = 0; i < ve.size(); i++) {
                sumVe += ve.get(i);
            }
            long sumVi = 0;
            for (int i = 0; i < one; i++) {
                sumVi += vi.get(i);
            }
            return Math.min(sumVe, sumVi);
        }
    }
}