/*
@b-knd (jingru) on 23 July 2022 10:11:00
*/

import java.util.*;

class Q704BinarySearch {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        
        while(start <= end){
            int mid = (start+end)/2;
            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] < target){
                //shift start pointer to midpoint+1 if midpoint element is smaller than target (continue searching in right half part of the array)
                start = mid+1;
            } else{
                //shift end pointer to midpoint-1 if midpoint element is larger than target (continue searching in left half part of the array)
                end = mid-1;
            }
        }
        return -1;
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Search.
//Memory Usage: 42.8 MB, less than 95.48% of Java online submissions for Binary Search.
