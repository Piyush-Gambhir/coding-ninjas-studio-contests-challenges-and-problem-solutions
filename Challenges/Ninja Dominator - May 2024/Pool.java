public class Solution {
    public static int minDays(int[] a, int n, int m) {
        long cycleSum = 0;
        for (int value : a) {
            cycleSum += value;
        }

        long currentWaterLevel = 0;
        int day = 0;
        while (day < n) {
            currentWaterLevel += a[day];
            day++;
            if (currentWaterLevel > m) {
                return day - 1;
            }
        }

        long totalCycles = m / cycleSum;
        long remainingCapacity = m - (totalCycles * cycleSum);
        currentWaterLevel = 0;
        day = 0;
        while (true) {
            currentWaterLevel += a[day % n];
            day++;
            if (currentWaterLevel > remainingCapacity) {
                return (int) (totalCycles * n + day - 1);
            }
        }
    }
}
