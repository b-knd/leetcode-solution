/*
@b-knd (jingru) on 26 July 2022 11:23:00
*/

import java.util.*;

class Q1929ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int[] res = new int[nums.length * 2];
        for(int i = 0; i < nums.length * 2; i++){
            res[i] = nums[i % nums.length];
        }
        return res;
    }
}

//Runtime: 1 ms, faster than 98.83% of Java online submissions for Concatenation of Array.
//Memory Usage: 42.9 MB, less than 89.43% of Java online submissions for Concatenation of Array.
