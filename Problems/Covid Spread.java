import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public static int covidSpread(ArrayList<ArrayList<Integer>> houses) {
        int rows = houses.size();
        int cols = houses.get(0).size();

        int[] dr = { -1, 1, 0, 0 };
        int[] dc = { 0, 0, -1, 1 };

        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (houses.get(i).get(j) == 2) {
                    queue.add(new int[] { i, j, 0 });
                }
            }
        }

        int days = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentRow = current[0];
            int currentCol = current[1];
            int currentDays = current[2];

            days = Math.max(days, currentDays);

            for (int i = 0; i < 4; i++) {
                int newRow = currentRow + dr[i];
                int newCol = currentCol + dc[i];

                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols) {
                    if (houses.get(newRow).get(newCol) == 1) {
                        houses.get(newRow).set(newCol, 2);
                        queue.add(new int[] { newRow, newCol, currentDays + 1 });
                    }
                }
            }
        }

        for (ArrayList<Integer> row : houses) {
            for (int house : row) {
                if (house == 1) {
                    return -1;
                }
            }
        }

        return days;
    }
}