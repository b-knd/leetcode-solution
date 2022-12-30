class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        dfs(0, graph.length-1, graph, new ArrayList<>());
        return res;
    }

    public void dfs (int curr, int target, int[][] graph, List<Integer> currPath){
        currPath.add(curr);
        //complete path
        if(curr == target){
            res.add(currPath);
            return;
        }
        //dfs on next node
        else if(graph[curr].length > 0){

            int[] possiblePath = graph[curr];
            for(int i: possiblePath){
                dfs(i, target, graph, new ArrayList<>(currPath));
            }
        } else{
            return;
        }
    }
}
