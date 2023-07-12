import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    List<Integer> safeNodes = new ArrayList<>();
    List<Integer> flagNodes = new ArrayList<>();
    //status = 0 means not yet checked
    //status = 1 means safeNodes
    //status = 2 means unsafeNodes
    int[] status;

    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        status = new int[n];

        for (int i = 0; i < n; i++) {
            if (dfs(i, graph)) {
                safeNodes.add(i);
            }
        }

        Collections.sort(safeNodes);
        return safeNodes;
    }

    public boolean dfs(int node, int[][] graph) {
        if (status[node] != 0) {
            return status[node] == 1;
        }

        status[node] = 2;
        for (int neighbor : graph[node]) {
            if (!dfs(neighbor, graph)) {
                return false;
            }
        }

        status[node] = 1;
        return true;
    }
}
