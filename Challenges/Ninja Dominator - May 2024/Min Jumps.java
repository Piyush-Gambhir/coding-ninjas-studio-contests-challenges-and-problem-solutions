/*
Problem statement
You live in a Ninja town which is in the form of a N * M grid. In this town, people travel from one place to another by jumping over the buildings which are present in each cell of the grid. It is Christmas eve, and Santa wants to give gifts and chocolates to the kids who live in the building which is present at the cell (N - 1, M - 1). Initially, Santa is present on cell (0, 0). Since Santa is in a hurry, help him find a path from starting point to the endpoint with the least amount of time.

The Santa may go only from one building to any of its adjacent buildings which is present either to the right or to the bottom or bottom right cell i.e. if the current position is (x, y), he may go to (x + 1, y + 1) or (x + 1, y) or (x, y + 1) given that the new coordinates are in the grid. The time taken to reach from one building to another is equal to the absolute difference between the heights of buildings.

Note:

1. The heights of the buildings are positive.
2. Santa starts from the cell (0, 0) and he has to reach the building (N - 1, M - 1).
3. Santa cannot leave the grid at any point of time.
*/

import java.util.*;

public class Solution {
    public static int findMinCost(int[][] arr, int n, int m) {
        int[] dx = { 0, 1, 1 };
        int[] dy = { 1, 0, 1 };

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[2]));

        int[][] cost = new int[n][m];
        for (int[] row : cost)
            Arrays.fill(row, Integer.MAX_VALUE);
        cost[0][0] = 0;

        pq.offer(new int[] { 0, 0, 0 });

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int x = current[0], y = current[1], currentCost = current[2];
            if (x == n - 1 && y == m - 1) {
                return currentCost;
            }

            for (int i = 0; i < 3; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    int newCost = currentCost + Math.abs(arr[x][y] - arr[nx][ny]);
                    if (newCost < cost[nx][ny]) {
                        cost[nx][ny] = newCost;
                        pq.offer(new int[] { nx, ny, newCost });
                    }
                }
            }
        }

        return cost[n - 1][m - 1];
    }

}
