//definition of quad tree can be found below the solution code

class Solution {
    public Node construct(int[][] grid) {
        return constructFromTo(grid, 0, 0, grid.length-1, grid[0].length-1);
    }

    //helper recursive function
    //rowStart, colStart, rowEnd and colEnd each helps to identify which portion of the grid we need to handle for now
    public Node constructFromTo(int[][] grid, int rowStart, int colStart, int rowEnd, int colEnd){
        //a variable used to update new starting and ending rows/columns
        int x = (rowEnd - rowStart + 1)/2 - 1;

        //the first element in the current grid portion (used for comparison)
        int curr = grid[rowStart][colStart];

        //nested loop to check if all elements in the grid are the same
        for(int i = rowStart; i <= rowEnd; i++){
            for(int j = colStart; j <= colEnd; j++){

                //found node that is different than curr
                //create a root node, divide grid into four parts that will be the four children of the root node
                if(grid[i][j] != curr){
                    Node topLeft = constructFromTo(grid, rowStart, colStart, rowStart+x, colStart+x);
                    Node topRight = constructFromTo(grid, rowStart, colStart+x+1, rowStart+x, colEnd);
                    Node bottomLeft = constructFromTo(grid, rowStart+x+1, colStart, rowEnd, colStart+x);
                    Node bottomRight = constructFromTo(grid, rowStart+x+1, colStart+x+1, rowEnd, colEnd);
                    return new Node(true, false, topLeft, topRight, bottomLeft, bottomRight);
                }
            }
        }

        //successfully passed loop means all elements are equal, construct a node which is a leaf and with value matching value in the grid
        return new Node(curr == 1? true: false, true);
    }
}


/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    
    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
};
*/
