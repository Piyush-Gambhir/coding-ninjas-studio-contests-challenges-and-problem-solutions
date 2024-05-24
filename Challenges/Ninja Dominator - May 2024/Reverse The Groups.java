import java.util.*;
import java.io.*;

public class Solution {
    static Stack<Integer> reverseTheGroups(Stack<Integer> s, int n, int k) {
        List<Integer> elements = new ArrayList<>();

        while (!s.isEmpty()) {
            elements.add(s.pop());
        }


        for (int i = 0; i < n; i += k) {
            int end = Math.min(i + k, n);
            if (end - i < k) {
                break;
            }
            Collections.reverse(elements.subList(i, end));
        }

        Collections.reverse(elements);
        for (int element : elements) {
            s.push(element);
        }

        return s;
    }
}
