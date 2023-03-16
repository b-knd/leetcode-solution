class Solution {
    public int pivotIndex(int[] nums) {
        int lsum = 0;
        int total = 0;

        //sum of all element in the array
        for(int i: nums){
            total += i;
        }

        for(int j = 0; j < nums.length; j++){
            //keep track of left sum with variable lsum
            //if lsum * 2 == total - pivot number means right sum equals left sum and we return the pivot number
            if(lsum * 2 == total - nums[j]){
                return j;
            }
            lsum += nums[j];
        }
        return -1;
    }
}
