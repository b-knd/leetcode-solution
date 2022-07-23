/*
@b-knd (jingru) on 23 July 2022 10:28:00
*/

import java.util.*;

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = -1;
        
        //search target row by comparing last elements of row
        for(int i = 0; i < matrix.length; i++){
            int element = matrix[i][matrix[0].length-1];
            if(element == target){
                return true;
            } else if(element > target){
                row = i;
                break;
            }
        }
      
        //row not found
        if(row == -1){
          return false;
        }
      
        
        //binary search, refer Q704 (or can use Arrays.binarySearch(array, target))
        int start = 0;
        int end = matrix[0].length-1;
        
        while(start <= end){
            int midpoint = (start + end)/2;
            
            if(matrix[row][midpoint] == target){
                return true;
            } else if(matrix[row][midpoint] < target){
                start = midpoint + 1;
            } else{
                end = midpoint - 1;
            }
        }
        return false;
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Search a 2D Matrix.
//Memory Usage: 41.9 MB, less than 92.96% of Java online submissions for Search a 2D Matrix.
