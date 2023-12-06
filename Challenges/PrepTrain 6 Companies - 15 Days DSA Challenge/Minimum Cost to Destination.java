import java.util.*;

public class Solution {

    public static int minCostToDestination(int[][] matrix, int x, int y) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return -1;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        if (matrix[0][0] == 0 || matrix[x][y] == 0) {
            return -1;
        }

        int[][] directions = { { 0, -1 }, { 0, 1 }, { -1, 0 }, { 1, 0 } };

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] { 0, 0, 0 });

        matrix[0][0] = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentRow = current[0];
            int currentCol = current[1];
            int currentCost = current[2];

            if (currentRow == x && currentCol == y) {
                return currentCost;
            }

            for (int[] direction : directions) {
                int newRow = currentRow + direction[0];
                int newCol = currentCol + direction[1];

                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols) {
                    if (matrix[newRow][newCol] == 1) {
                        int cost = direction[0] != 0 ? currentCost + 1 : currentCost;

                        matrix[newRow][newCol] = 0;

                        queue.offer(new int[] { newRow, newCol, cost });
                    }
                }
            }
        }

        return -1;
    }
}
