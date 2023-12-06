import java.util.*;
import java.io.*;

public class Solution {

    public static List<String> generateBinaryNumbers(int n) {
        // Write your code here
        List<String> list = new ArrayList<String>();
        Queue<String> q = new LinkedList<String>();
        q.add("1");
        while (n-- > 0) {
            String s1 = q.peek();
            q.remove();
            list.add(s1);
            String s2 = s1;
            q.add(s1 + "0");
            q.add(s2 + "1");
        }
        return list;
    }

}
