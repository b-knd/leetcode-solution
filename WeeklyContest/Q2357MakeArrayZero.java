/*
  @b-knd (jingru) on 31 July 2022 14:39:00  
*/

class Solution {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int min = 0;

        //if max element is already 0 means the entire array is 0, so no step needed
        int max = nums.length -1;
        if(nums[max] == 0){
            return 0;
        }

        //find the first non-zero element using a while loop 
        //since we have already eliminated the situation where array is all zero, do not need to worry about index out of bound exception
        while(nums[min] == 0){
            min++;
        }

        //only when cumulative sum >= max element means the whole array have been transformed to 0
        int count = 0;
        int cumSum = 0;
        while(cumSum < nums[max]){
            //since we do not update element after deduction, to find the next smallest element we need to deduct cumulative sum from the element first
            int x = nums[min]-cumSum;
            cumSum += x;
            //increment min to make it point to next smaller non-zero element (since the current one has been made zero)
            min++;
            //we do not increment step count if element is zero (it means the element has already been reduced to zero previously)
            if(x > 0){
                count++;
            }
        }
        return count;
    }
}
