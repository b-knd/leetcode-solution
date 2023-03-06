
class Solution {
    public int findKthPositive(int[] arr, int k) {
        //count number of missing integers
        int count = 0;
        //incremented by one to check for missing integer
        int curr = 0;
        //pointer for array
        int idx = 0;

        while(count < k && idx < arr.length){
            curr++;
            //if integer matches current, proceed to next element in array and next integer
            //otherwise, increment count by 1, if count == k return
            if(arr[idx] == curr){
                idx++;
            } else{
                count++;
                if(count == k){
                    return curr;
                }
            }
        }
        //finish iterating array but count < k, return the corresponding integer (we are still short of (k-count) integer)
        return curr + (k - count);
    }
}
