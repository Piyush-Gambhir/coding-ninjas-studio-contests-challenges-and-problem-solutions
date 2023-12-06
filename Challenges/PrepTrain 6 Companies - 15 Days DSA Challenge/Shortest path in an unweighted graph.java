public class Solution {

    public static LinkedList<Integer> shortestPath(int[][] edges, int n, int m, int s, int t) {
        // Write your code here.
        LinkedList<Integer> path = new LinkedList<>();
        if (edges == null || edges.length == 0) {
            return path;
        }

        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            graph.putIfAbsent(u, new ArrayList<>());
            graph.putIfAbsent(v, new ArrayList<>());

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(s);

        Map<Integer, Integer> parent = new HashMap<>();

        parent.put(s, -1);

        while (!queue.isEmpty()) {
            int node = queue.poll();

            if (node == t) {
                break;
            }

            for (int neighbor : graph.get(node)) {
                if (!parent.containsKey(neighbor)) {
                    parent.put(neighbor, node);
                    queue.offer(neighbor);
                }
            }
        }

        if (!parent.containsKey(t)) {
            return path;
        }

        int node = t;

        while (node != -1) {
            path.addFirst(node);
            node = parent.get(node);
        }

        return path;
    }

}