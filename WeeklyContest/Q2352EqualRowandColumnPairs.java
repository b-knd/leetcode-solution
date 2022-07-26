/*
@b-knd (jingru) on 26 July 2022 11:10:00
*/

import java.util.*;

class Solution {
    public int equalPairs(int[][] grid) {
        int count = 0;
        
        //build a hashmap to keep rows in the form of string and count (how many times the same row combination appear in grid)
        HashMap<String, Integer> rows = new HashMap<>();
        for(int[] i: grid){
            StringBuilder s = new StringBuilder();
            for(int j: i){
                s.append(j).append(" ");
            }
            rows.put(String.valueOf(s), rows.getOrDefault(String.valueOf(s), 0)+1);
        }
        for(int i = 0; i < grid[0].length; i++){
            //check if the column combination exists in hashmap, if yes update count with value in hashmap
            StringBuilder s = new StringBuilder();
            for (int[] ints : grid) {
                s.append(ints[i]).append(" ");
            }
            if(rows.containsKey(String.valueOf(s))){
                count+=rows.get(String.valueOf(s));
            }
        }
        return count;
    }
}
