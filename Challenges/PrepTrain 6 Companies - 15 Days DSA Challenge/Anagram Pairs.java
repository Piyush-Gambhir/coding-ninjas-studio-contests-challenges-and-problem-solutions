import java.util.*;

public class Solution {

    public static boolean isAnagram(String str1, String str2) {
        // Your code goes here
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (map.containsKey(ch)) {
                int freq = map.get(ch);
                map.put(ch, freq + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            if (!map.containsKey(ch)) {
                return false;
            } else {
                int freq = map.get(ch);
                if (freq == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, freq - 1);
                }
            }
        }

        return map.size() == 0;
    }

}