import java.util.*;

public class Solution {

    public static int portals(int[] dest) {
        final int MOD = 1000000007;
        int n = dest.length;
        boolean[] visited = new boolean[n];
        int[] useCount = new int[n];
        int currentRoom = 0;
        int visits = 0;
        int portalUses = 0;

        while (visits < n) {
            if (!visited[currentRoom]) {
                visited[currentRoom] = true;
                visits++;
            }

            useCount[currentRoom]++;
            portalUses++;

            if (useCount[currentRoom] % 2 == 1) {
                currentRoom = dest[currentRoom];
            } else {
                currentRoom = (currentRoom + 1) % n;
            }
        }

        return portalUses - 1 % MOD;
    }

}
