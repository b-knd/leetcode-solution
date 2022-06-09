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


public class Q35SearchInsertPosition {
    public static void main(String[] args) {
        Q35SearchInsertPosition test = new Q35SearchInsertPosition();
        System.out.println(test.searchInsert(new int[] {1, 3, 5, 6}, 5));
        System.out.println(test.searchInsert(new int[] {1, 3, 5, 6}, 2));
        System.out.println(test.searchInsert(new int[] {1, 3, 5, 6}, 7));
        System.out.println(test.searchInsert(new int[] {1, 3, 5, 6}, 0));
    }
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(end - start > 0) {
            int midpoint = (start + end) / 2;
            if (target == nums[midpoint]) {
                return midpoint;
            } else if (target < nums[midpoint]) {
                end = midpoint - 1;
            } else {
                start = midpoint + 1;
            }
        }
        if(target <= nums[start]){
            return start;
        } else{
            return start+1;
        }
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
//Memory Usage: 43.8 MB, less than 20.75% of Java online submissions for Search Insert Position.
