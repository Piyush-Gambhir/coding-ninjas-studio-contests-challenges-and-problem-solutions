import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static int[][] printAdjacency(int n, int m, int[][] edges) {
        List<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < m; i++) {
            graph[edges[i][0]].add(edges[i][1]);
            graph[edges[i][1]].add(edges[i][0]);
        }

        int[][] adjacencyList = new int[n][];

        for (int i = 0; i < n; i++) {
            int graphSize = graph[i].size();
            int[] temp = new int[graphSize + 1];
            temp[0] = i;

            for (int j = 0; j < graph[i].size(); j++) {
                temp[j + 1] = graph[i].get(j);
            }

            adjacencyList[i] = temp;
        }

        return adjacencyList;
    }
}