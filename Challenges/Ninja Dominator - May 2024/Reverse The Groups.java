import java.util.*;
import java.io.*;

public class Solution {
    static Stack<Integer> reverseTheGroups(Stack<Integer> s, int n, int k) {
        List<Integer> elements = new ArrayList<>();

        while (!s.isEmpty()) {
            elements.add(s.pop());
        }

        Collections.reverse(elements);

        for (int i = 0; i < n; i += k) {
            int end = Math.min(i + k, n);
            Collections.reverse(elements.subList(i, end));
        }

        for (int element : elements) {
            s.push(element);
        }

        return s;
    }
}
