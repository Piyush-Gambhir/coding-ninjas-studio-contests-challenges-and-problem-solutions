public class Solution {

    public static long transactions(int[] money) {

        // Write your code here
        int maxMoney = 0;
        int currentMoney = 0;
        for (int i = 0; i < money.length; i++) {
            currentMoney += money[i];
            if (currentMoney > maxMoney) {
                maxMoney = currentMoney;
            }
            
        }
        return maxMoney;
    }
}