/*
Problem statement
Ninja and his friend are playing a game called flip game. They are given a string ‘STR’ containing only two characters, ‘$’ and ‘*.’

In this game, Ninja and his friend take turns to flip two consecutive “$$” to “**”. The flip game ends when Ninja or his friend can no longer make a move, i.e., there is no consecutive “$$” present in the ‘STR’ and, therefore, the other person will be the winner of the game.

Both the players play the game optimally in alternate turns. Given that Ninja starts the game i.e. takes the first turn, your task is to find out if he wins the game.

For example:
Let 'STR' = "$$**".

There are consecutive "$$" in 'STR' and it is Ninja's turn to begin the game. So, Ninja changes the consecutive "$$" to "**". This changes 'STR' to "****". 

Now, as it is his friend's turn and there are no more consecutive "$$", Ninja wins the game.
*/

import java.util.*;

public class Solution {
    public static boolean canNinjaWin(String str) {
        return canWin(str.toCharArray());
    }

    private static boolean canWin(char[] str) {
        for (int i = 0; i < str.length - 1; i++) {
            if (str[i] == '$' && str[i + 1] == '$') {
                str[i] = '*';
                str[i + 1] = '*';

                boolean opponentWins = canWin(str);

                str[i] = '$';
                str[i + 1] = '$';

                if (!opponentWins) {
                    return true;
                }
            }
        }
        return false;
    }

}
