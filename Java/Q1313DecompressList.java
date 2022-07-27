/*
@b-knd (jingru) on 27 July 2022 09:57:00
*/

import java.util.*;

class Q1313DecompressList {
    public int[] decompressRLElist(int[] nums) {
        //loop through nums to calculate required length for the result array
        int length = 0;
        for(int i = 0; i < nums.length; i+=2){
            length += nums[i];
        }
         
        //fill result array using Arrays.fill()
        int[] res = new int[length];
        int index = 0;
        for(int i = 0; i < nums.length; i+= 2){
            Arrays.fill(res, index, index+nums[i], nums[i+1]);
            index += nums[i];
        }
        return res;
    }
}

//Runtime: 1 ms, faster than 98.12% of Java online submissions for Decompress Run-Length Encoded List.
//Memory Usage: 47.8 MB, less than 65.95% of Java online submissions for Decompress Run-Length Encoded List.
