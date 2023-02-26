class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        //answer is simply number of subarray with all elements <= right minus number of subarrays with all elements < left
        return count(nums, right) - count(nums,left-1);
    }


    //function that find the number of subarray with all element smaller/equal to bound;
    public int count(int[] nums, int bound){
        int ans = 0;
        int count = 0;
        for(int i: nums){
            //count denotes the number of previous element (continuous) that is <= bound
            //if the current element > bound, we'll have to reset count
            count = i <= bound? count+1: 0;
            ans += count;
        }
        return ans;
    }
}
