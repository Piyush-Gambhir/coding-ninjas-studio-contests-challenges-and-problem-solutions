import java.util.*;

public class Solution {
    public static int maximumProfit(ArrayList<Integer> prices) {
        if (prices == null || prices.size() < 2) {
            return 0;
        }

        int maxProfit = 0;
        int minPrice = prices.get(0);

        for (int i = 1; i < prices.size(); i++) {
            int currentPrice = prices.get(i);
            int currentProfit = currentPrice - minPrice;

            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }

            if (currentPrice < minPrice) {
                minPrice = currentPrice;
            }
        }

        return maxProfit;
    }
}
