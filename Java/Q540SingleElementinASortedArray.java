class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int prev = nums[0];

        for(int i = 1; i < nums.length; i++){
            //prev has not been repeated and we return it
            if(nums[i] != prev){
                return prev;
            }
            //we found repeated element, use while loop to skip them until finding an element that is not equal to prev, reset prev to that new element
            else{
                while(i < nums.length && nums[i] == prev){
                    i++;
                }
                prev = nums[i];
            }
        }
        return prev;
    }
}
