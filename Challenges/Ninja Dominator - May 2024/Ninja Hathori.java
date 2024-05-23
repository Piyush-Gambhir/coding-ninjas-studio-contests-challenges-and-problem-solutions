import java.util.*;

public class Solution {

    public static String ninjaHathori(String t) {
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < t.length() - 1; i += 2) {
            s.append(t.charAt(i));
        }

        s.append(t.charAt(t.length() - 1));

        return s.toString();
    }

}
