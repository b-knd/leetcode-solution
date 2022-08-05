/*
@b-knd (jingru) on 05 August 2022 08:21:00
*/

class Solution {
    //dp is used to keep number of ways to get to target sum to prevent repetitive calculations
    private int[] dp;
    
    public int combinationSum4(int[] nums, int target) {
        dp = new int[target+1];
        Arrays.fill(dp, -1);
        dp[0] = 1;
        return numberOfWays(target, nums);
        
    }
    
    public int numberOfWays(int target, int[] nums){
        if(dp[target] != -1){
            return dp[target];
        }
        int res = 0;
        for(int c: nums){
            if(target >= c){
                res += numberOfWays(target-c, nums);
            }
        }
        dp[target] = res;
        return res;
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Combination Sum IV.
//Memory Usage: 40 MB, less than 86.35% of Java online submissions for Combination Sum IV.


