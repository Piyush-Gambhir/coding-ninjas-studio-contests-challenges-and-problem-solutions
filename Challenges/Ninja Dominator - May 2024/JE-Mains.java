/*
Problem statement
Ninja got ‘X’ marks in JE-Mains. But his friend Joshi wonders if he is telling the right marks or just telling any random number. The only way of judging this without seeing his mark sheet is to check whether it is possible to get ‘X’ marks in the exam.

This time, there were total ‘N’ questions in the JE-Mains exam.

As we all know, JE-Mains is MCQ based exam, where we get 4 marks for each correct answer and -1 for each wrong answer. Also, it is not compulsory to attempt all the questions.

So return 1 if a ninja could get ‘X’ marks or return 0.

For Example :
Let 'N' = 4, 'X' = 7.
Ninja can correctly answer 2 questions, incorrectly answer 1 and skip 1 for a score of '4 * 2 - 1 * 1 + 0 * 1 = 7'.
Therefore, it is possible to obtain a total score of 'X'.
*/

public class Solution {
    public static int badMemories(long n, long x) {
        for (long c = 0; c <= n; c++) {
            long w = 4 * c - x;
            if (w >= 0 && c + w <= n) {
                return 1;
            }
        }
        return 0;
    }
}
