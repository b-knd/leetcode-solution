/*
@b-knd (jingru) on 27 July 2022 08:20:00
*/

import java.util.*;

class Q1480RunningSum {
    public int[] runningSum(int[] nums) {
        //accumulate sum in the variable val and update nums array
        int val = 0;
        for(int i = 0; i < nums.length; i++){
            val += nums[i];
            nums[i] = val;
        }
        return nums;
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Running Sum of 1d Array.
//Memory Usage: 43.9 MB, less than 7.78% of Java online submissions for Running Sum of 1d Array.
