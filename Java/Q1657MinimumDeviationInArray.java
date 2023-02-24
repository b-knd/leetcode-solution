//concept: min deviation is by narrowing range between smallest element and largest element
//largest element will need to be divided to narrow the range, odd element can only be multiply by 2 once (so we did it in the beginning)

class Solution {
    public int minimumDeviation(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        int min = Integer.MAX_VALUE;
        
        //intiate minimum value after multiplying all odd numbers by 2
        for(int i: nums){
            int tmp = i;
            if(tmp % 2 != 0){
                tmp *= 2;
            }
            pq.add(tmp);
            min = Math.min(min, tmp);
        }

        int minDeviation = Integer.MAX_VALUE;
        
        while(!pq.isEmpty()){
            int curr = pq.poll();
            
            //update min deviation
            minDeviation = Math.min(minDeviation, curr - min);
            
            //if maximum element cannot be divided further, break and return the answer
            if(curr % 2 != 0){
                break;
            }
            
            //otherwise, divide maximum element by 2, update min and add the new element to queue
            curr /= 2;
            min = Math.min(min, curr);
            pq.add(curr);
        }
        return minDeviation;
    }
}
