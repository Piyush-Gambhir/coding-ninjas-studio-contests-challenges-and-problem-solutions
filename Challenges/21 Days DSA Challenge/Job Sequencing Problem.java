import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Solution {
    static class JobComparator implements Comparator<int[]> {
        @Override
        public int compare(int[] job1, int[] job2) {
            if (job1[2] == job2[2]) {
                return job2[1] - job1[1];
            }
            return job2[2] - job1[2];
        }
    }

    public static int[] jobScheduling(int[][] jobs) {
        Arrays.sort(jobs, new JobComparator());

        int maxProfit = 0;
        int numberOfJobs = 0;
        int maxDeadline = 0;

        for (int i = 0; i < jobs.length; i++) {
            maxDeadline = Math.max(maxDeadline, jobs[i][1]);
        }

        TreeSet<Integer> slots = new TreeSet<>(Collections.reverseOrder());

        for (int i = maxDeadline; i > 0; i--) {
            slots.add(i);
        }

        for (int i = 0; i < jobs.length; i++) {
            if (slots.isEmpty() || jobs[i][1] < slots.last()) {
                continue;
            }

            Integer availableSlot = slots.ceiling(jobs[i][1]);
            if (availableSlot != null) {
                maxProfit += jobs[i][2];
                numberOfJobs += 1;
                slots.remove(availableSlot);
            }
        }

        int[] ans = { numberOfJobs, maxProfit };
        return ans;
    }
}