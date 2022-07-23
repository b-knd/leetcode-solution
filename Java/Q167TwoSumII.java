/*
@b-knd (jingru) on 23 July 2022 09:40:00
*/

import java.util.*;

class Q167TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        
        while(start < end){
            int x = numbers[start];
            int y = numbers[end];
            
            int mid = (start + end)/2;
            
            if(x + y == target){
                break;
            }
            
            //if sum is smaller than target means left pointer need to be incremented to decrease sum
            //if sum of midpoint and right pointer still smaller, we update left pointer with midpoint, otherwise incremented by 1 (taking leap if possibile)
            //same goes to decrementing right pointer if sum is larger than target
            if(x + y < target){
                start = (numbers[mid] + y <= target ? mid: start+1);
            } else{
                end = (x + numbers[mid] >= target ? mid: end-1);
            }
        }     
        return new int[] {start+1, end+1};
    }
}

//Runtime: 1 ms, faster than 99.22% of Java online submissions for Two Sum II - Input Array Is Sorted.
//Memory Usage: 49.7 MB, less than 73.90% of Java online submissions for Two Sum II - Input Array Is Sorted.
