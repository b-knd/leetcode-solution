class Solution {
    public int shipWithinDays(int[] weights, int days) {
        //minimum capacity needed will be the maximum element in the array
        //maximum will be the sum of all elements in the array
        int minCap = 0;
        int maxCap = 0;
        for(int i: weights){
            minCap = Math.max(minCap, i);
            maxCap += i;
        }

        //binary search on the answer
        int ans = maxCap;
        int medium;
        while(minCap <= maxCap){
            medium = (minCap + maxCap)/2;
            if(possible(weights, days, medium)){
                ans = medium;
                maxCap = medium-1;
            } else{
                minCap = medium+1;
            }
        }
        return ans;
    }

    //function to find if it is possible to carry witht the capacity
    public boolean possible(int[] weights, int days, int cap){
        int count = 1;
        int acc = 0;
        for(int i: weights){
            if(acc + i > cap){
                count++;
                acc = 0;
            } 
            acc += i;
        }
        if(count > days){
            return false;
        }
        return true;
    }
}
