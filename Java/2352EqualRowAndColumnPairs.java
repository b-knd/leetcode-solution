class Solution {
    public int equalPairs(int[][] grid) {
        int res = 0;
        //add all columns and keep track of duplicates using hash map
        Map<String, Integer> hm = new HashMap<>();
        for(int i = 0; i < grid[0].length; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < grid.length; j++){
                sb.append(grid[i][j]).append(",");
            }
            hm.put(sb.toString(), hm.getOrDefault(sb.toString(), 0)+1);
        }

        //update res if same column exists
        for(int j = 0; j < grid.length; j++){
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < grid[0].length; i++){
                sb.append(grid[i][j]).append(",");
            }
            res += hm.getOrDefault(sb.toString(), 0);
        }
        return res;
    }
}
