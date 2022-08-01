/*
@b-knd (jingru) on 01 August 2022 16:58:00
*/

class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] res = new int[m][n];
      
        //fill array with -1 (so no need to fill -1, so we can straightaway return matrix after finish traversing linked list
        for (int[] row: res){
            Arrays.fill(row, -1);
        }
      
        //this keep track of current starting and ending point for both row and column (will be updated in the loop)
        int rowStart = 0, rowEnd = m-1;
        int colStart = 0, colEnd = n-1;
        
        //row and col keep track of current coordinate to be filled
        int row = 0, col = 0;
      
        while(head != null){
          
            //to check whether to start from left or right, col equals colStart means the direction is from left to right and vice versa (else condition: right to left)
            if(col == colStart || row == rowStart){
              
                //fill up column from colStart until colEnd while traversing the list, incrementing col)
                while(col <= colEnd && head != null){
                    res[row][col] = head.val;
                    head = head.next;
                    col++;
                }
                //reset col to colEnd (because we might have incremented col by extra 1 in while loop)
                //cannot simply use col-- because we might not even enter while loop
                col = colEnd;
              
                //once we have filled up one column, means starting row had been incremented by 1, and we set row to be rowStart
                rowStart++;
                row = rowStart;
                
                //fill up row from rowStart until rowEnd, increment row
                while(row <= rowEnd && head != null){
                    res[row][col] = head.val;
                    head = head.next;
                    row++;
                }
                //similar explanation to above;
                row = rowEnd;
              
                //once we have filled up one row means colEnd had decreased
                colEnd--;
                col = colEnd;
            } else{
              
                //similar explanation, just different direction (refer to comments above)
                //filling up column
                while(col >= colStart && head != null){
                    res[row][col] = head.val;
                    col--;
                    head = head.next;
                }
                rowEnd--;
                row = rowEnd;
                col = colStart;
                
                //filling up rows
                while(row >= rowStart && head != null){
                    res[row][col] = head.val;
                    row--;
                    head = head.next;
                }
                colStart++; 
                row = rowStart;
                col = colStart;            
            }
        } 
        return res;
    }
}

//Runtime: 12 ms, faster than 85.35% of Java online submissions for Spiral Matrix IV.
//Memory Usage: 244.6 MB, less than 54.47% of Java online submissions for Spiral Matrix IV.
