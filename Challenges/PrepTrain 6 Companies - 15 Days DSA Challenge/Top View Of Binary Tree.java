
/*********************************************

 Following is the TreeNode class structure

 class TreeNode {
     int data;
     TreeNode left;
     TreeNode right;

     TreeNode(int data) {
         this.data = data;
         this.left = null;
         this.right = null;
     }
 }

 *********************************************/
import java.util.*;

class Pair {
    int data;
    int level;

    Pair() {
    }

    Pair(int data, int level) {
        this.data = data;
        this.level = level;
    }
}

public class Solution {
    public static void applyPreOrder(TreeNode root, int hDistance, int level, HashMap<Integer, Pair> visited) {
        if (root == null) {
            return;
        }

        if (!visited.containsKey(hDistance) || visited.get(hDistance).level > level) {
            visited.put(hDistance, new Pair(root.data, level));
        }

        applyPreOrder(root.left, hDistance - 1, level + 1, visited);

        applyPreOrder(root.right, hDistance + 1, level + 1, visited);
    }

    public static List<Integer> getTopView(TreeNode root) {
        HashMap<Integer, Pair> visited = new HashMap<>();

        applyPreOrder(root, 0, 0, visited);

        List<Integer> topView = new ArrayList<>();
        for (int key : visited.keySet()) {
            topView.add(key);
        }
        Collections.sort(topView);

        List<Integer> ans = new ArrayList<>();
        for (int i : topView) {
            ans.add((int) visited.get(i).data);
        }
        return ans;
    }
}