class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        //keeping dislike preference in a matrix
        boolean[][] dislikeGraph = new boolean[n][n];
        for(int[] edge: dislikes){
            dislikeGraph[edge[0]-1][edge[1]-1] = true;
            dislikeGraph[edge[1]-1][edge[0]-1] = true;

        }
        
        //group stands for grouping for the particular person, 0 for unassigned, 1 and -1 for the bipartition
        int[] groups = new int[n];
        for(int i = 0; i < groups.length; i++){
            if(groups[i] == 0 && !grouping(i, 1, groups, dislikeGraph)){
                return false;
            }
        }
        return true;
    }

    public boolean grouping(int index, int group, int[] groups, boolean[][] dislikeGraph){
        if(groups[index] != 0){
            //being group correctly
            return groups[index] == group;
        }

        //have not been assigned to a group
        //assign to group, check with dislike if there is any conflict
        groups[index] = group;
        for(int i = 0; i < groups.length; i++){
            if(dislikeGraph[index][i] && !grouping(i, -group, groups, dislikeGraph)){
                return false;
            }
        }
        return true;
    }
}
