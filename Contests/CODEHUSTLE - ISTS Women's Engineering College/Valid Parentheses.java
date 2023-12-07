import java.util.*;

public class Solution {
    public static boolean isValidParenthesis(String s) {
        // Write your code here.

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (current == '(' || current == '{' || current == '[') {
                stack.push(current);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if (current == ')' && top != '(') {
                    return false;
                } else if (current == '}' && top != '{') {
                    return false;
                } else if (current == ']' && top != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}