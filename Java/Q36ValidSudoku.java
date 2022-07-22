/*
@b-knd (jingru) 22 July 2022 09:31:00
*/

import java.util.*;

class Q36ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> hs = new HashSet<>();
        
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(isValid(board, hs, i, j)){
                    hs.add("row"+i+board[i][j]);
                    hs.add("col"+j+board[i][j]);
                    hs.add("box"+i/3+j/3+board[i][j]);
                } else{
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean isValid(char[][] board, HashSet<String> hs, int i, int j){
        if(board[i][j] != '.'){
            if(hs.contains("row"+i+board[i][j]) || hs.contains("col"+j+board[i][j])){
                return false;
            }       
            if(hs.contains("box"+i/3+j/3+board[i][j])){
                return false;
            }
        }
        return true;
    }
}
