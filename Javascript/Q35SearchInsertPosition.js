/*
Description:
Given a sorted array of distinct integers and a target value, return the index if the target is found. 
If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.
Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4
*/

var searchInsert = function(nums, target) {
    let start = 0;
    let end = nums.length - 1;
    while (end - start > 0) {
        let midpoint = Math.floor((start + end) / 2);
        if(target === nums[midpoint]) {
            return midpoint;
        } else if(target < nums[midpoint]) {
            end = midpoint - 1;
        } else{
            start = midpoint + 1;
        }
        
    }
    if(target <= nums[start]) {
        return start;
    } else {
        return start + 1;
    }
};


//Runtime: 67 ms, faster than 84.98% of JavaScript online submissions for Search Insert Position.
//Memory Usage: 42 MB, less than 71.12% of JavaScript online submissions for Search Insert Position.



