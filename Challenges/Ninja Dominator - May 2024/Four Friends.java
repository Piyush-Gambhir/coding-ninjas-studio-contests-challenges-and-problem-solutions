/*
Problem statement
Ninja and his 3 friends decided to play a game.

They have a binary string ‘S’ of length ‘N,’ where ‘N’ is always a multiple of four.

In the game, each of his friends will go one by one and pick the first four characters of the string. The player gets one point for each ‘1’ picked. After picking up the character, they are removed from the string. The game ends when the string is empty.

Ninja got a chance to decide his position to start the game, i.e., “1, 2, 3, or 4”.

Note:

The player with the maximum points wins the game. If more than one player scores the highest points, no one is declared a winner.
Ninja is not so intelligent. Can you help him win the game?

Example:

‘N’ = 12, ‘S’ = “011011101100”.
Ninja will pick the string 111 and gain 3 points if he starts from the second position, which is the maximum.
Hence Ninja wins the game.
*/

import java.util.*;

public class Solution {
    static String fourFriends(String s) {
        int N = s.length();
        int rounds = N / 4;
        int[][] scores = new int[4][4]; // scores[position][player]

        for (int startPos = 0; startPos < 4; startPos++) {
            String remainingString = s;
            for (int i = 0; i < rounds; i++) {
                for (int player = 0; player < 4; player++) {
                    int pickStart = player * 4;
                    if (pickStart >= remainingString.length()) {
                        break;
                    }
                    String picked = remainingString.substring(pickStart, pickStart + 4);
                    scores[startPos][player] += countOnes(picked);
                }
                if (remainingString.length() > 16) {
                    remainingString = remainingString.substring(16);
                } else {
                    remainingString = "";
                }
            }
        }

        int maxNinjaPoints = -1;
        int bestPosition = -1;
        boolean tie = false;

        for (int startPos = 0; startPos < 4; startPos++) {
            int ninjaPoints = scores[startPos][startPos];
            boolean isMax = true;
            for (int player = 0; player < 4; player++) {
                if (player != startPos && scores[startPos][player] > ninjaPoints) {
                    isMax = false;
                    break;
                }
            }
            if (isMax) {
                if (ninjaPoints > maxNinjaPoints) {
                    maxNinjaPoints = ninjaPoints;
                    bestPosition = startPos;
                    tie = false;
                } else if (ninjaPoints == maxNinjaPoints) {
                    tie = true;
                }
            }
        }

        if (tie || bestPosition == -1) {
            return "NO";
        } else {
            return "YES " + (bestPosition + 1);
        }
    }

    static int countOnes(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }

}
