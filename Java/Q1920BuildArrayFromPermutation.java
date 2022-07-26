/*
@b-knd (jingru) on 26 July 2022 11:04:00
*/

import java.util.*;

class Q1920BuildArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            res[i] = nums[nums[i]];
        }
        return res;
    }
}

//Runtime: 1 ms, faster than 99.95% of Java online submissions for Build Array from Permutation.
//Memory Usage: 54 MB, less than 27.19% of Java online submissions for Build Array from Permutation.
