/*
@b-knd (jingru) on 24 July 2022 09:37:00
*/

import java.util.*;

/*
Concept: use XOR (^) to cancel out identical elements
*/

class Solution {
    public int singleNumber(int[] nums) {
        int ans = nums[0];
        for(int i = 1; i < nums.length; i++){
            ans ^= nums[i];
        }
        return ans;
    }
}

//Runtime: 1 ms, faster than 100.00% of Java online submissions for Single Number.
//Memory Usage: 50.9 MB, less than 35.91% of Java online submissions for Single Number.
