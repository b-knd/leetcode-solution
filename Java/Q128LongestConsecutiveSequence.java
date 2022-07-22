/*
@b-knd (jingru) on 22 July 2022 on 10:19:00
*/

import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        
        //sort array, initiate max and length (used for comparing)
        Arrays.sort(nums);    
        int max = 0;
        int length = 1;
        
        /*
        loop thourgh the sorted array
        - if difference between current element and next element is 1, increment length
        - otherwise, if they are different, stop the increment and compare length with max, then reset length
        -- (if the two elements are of the same value, the consecutive sequence still holds, just that we do not need to increment the length)
        */
        for(int i = 0; i < nums.length-1; i++){
            if(Math.abs(nums[i] - nums[i+1]) == 1){
                length++;
            } else if (nums[i] != nums[i+1]) {
                max = Math.max(length, max);
                length = 1;
            }
        }
        max = Math.max(length, max);
        return max;
    }
}

//one for-loop: O(n) time complexity

//Runtime: 18 ms, faster than 93.70% of Java online submissions for Longest Consecutive Sequence.
//Memory Usage: 64.5 MB, less than 74.75% of Java online submissions for Longest Consecutive Sequence.
