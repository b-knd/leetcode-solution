class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        //minimum element in the list
        long low = Integer.MAX_VALUE;
        //minimum element times total trips
        long high = Integer.MAX_VALUE;
        for(int t: time){
            low = Math.min(low, t);
            high = Math.min(high, t);
        }
        high = totalTrips * high;

        long med = (low + high)/2;
        //binary search
        while(low < high){
            med = (low + high)/2;
            long acc = 0;
            for(int t: time){
                 acc += med / t;
            }
            if(acc >= totalTrips){
                high = med;
            } else{
                low = med + 1;
            }
        }
        return low;
    }
}
