/*
@b-knd (jingru) on 27 July 2022 08:45:00
*/

import java.util.*;

class Q1470ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        int j = 0;
        for(int i = 0; i < nums.length-1; i+=2){
            res[i] = nums[j];
            res[i+1] = nums[j+n];
            j++;
        }
        return res;
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Shuffle the Array.
//Memory Usage: 46.1 MB, less than 17.97% of Java online submissions for Shuffle the Array.
