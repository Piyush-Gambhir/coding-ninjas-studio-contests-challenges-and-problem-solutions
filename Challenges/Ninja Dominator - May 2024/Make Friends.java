import java.util.*;
import java.io.*;

public class Solution {

    public static String IsFriend(String s1, String s2) {
        Set<Character> charSet = new HashSet<>();
        for (char c : s2.toCharArray()) {
            charSet.add(c);
        }

        for (int i = 0; i < s1.length(); i++) {
            if (charSet.contains(s1.charAt(i))) {
                return "Yes";
            }
        }
        return "No";
    }
}