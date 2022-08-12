class Solution {
    public int findCenter(int[][] edges) {
        int x = edges[0][0];
        int y = edges[0][1];
        return (y == edges[1][0] || y == edges[1][1]? y: x);
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Center of Star Graph.
//Memory Usage: 79.3 MB, less than 38.19% of Java online submissions for Find Center of Star Graph.
