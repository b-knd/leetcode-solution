/*
@b-knd (jingru) on 05 August 2022 09:45:00
*/

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int sum = 0;
        for(int i = 0; i < tickets.length; i++){
            if(i <= k){
                sum += Math.min(tickets[i], tickets[k]);
            }
            //-1 because at the last turn, all these person (after target) do not need to be taken into consideration
            else{
                sum += Math.min(tickets[i], tickets[k]-1);
            }
        }
        return sum;    
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Time Needed to Buy Tickets.
//Memory Usage: 41.5 MB, less than 66.43% of Java online submissions for Time Needed to Buy Tickets.
