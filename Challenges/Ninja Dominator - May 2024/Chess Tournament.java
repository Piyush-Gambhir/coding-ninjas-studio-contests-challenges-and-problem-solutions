public class Solution {
    static int findScore(String result) {
        // Write your code here.
        int score = 0;
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == 'D') {
                continue;
            } else if (result.charAt(i) == 'L') {
                score -= 1;

            } else if (result.charAt(i) == 'W' && i + 1 < result.length() && result.charAt(i + 1) == 'W') {
                score += 2;
            } else if (result.charAt(i) == 'W') {
                score += 1;
            }
        }
    return score;
    }
}