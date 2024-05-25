/*
Problem statement
You have made a New Year’s Resolution to make a lot of money, and based on the advice of your smart (Not really) friends, you decide to invest in the stock market.

There are ‘N’ different stocks currently available in the market, and you have a magical machine that can accurately predict how much profit you can make on each stock. Sometimes, this value can be negative, indicating that buying it leads to a loss.

You can purchase at most ‘K’ of these stocks (or none at all). Given an array of the profits on each stock, find the maximum profit you can make.

For example:

If there are 3 stocks and the profit on them is [1,3,-2], and you are allowed to buy at most 1 stock, you can buy the second one and make a profit of 3.
*/

import java.util.*;
import java.io.*;

public class Solution {

    public static int maximumProfit(int n, int k, int[] profits) {
        // Write your code here.
        Arrays.sort(profits);
        int sum = 0;
        for (int i = n - 1; i >= n - k; i--) {
            if (profits[i] > 0) {
                sum += profits[i];
            }
        }

        return sum;
    }
}