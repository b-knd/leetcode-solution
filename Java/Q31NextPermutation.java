class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length <= 1) return;
        int back = nums.length-1;
        int front = back-1;
        while(front > 0 && nums[front] >= nums[front+1]){
            front -= 1;
        }
        

        //find element second larger than front
        //if none, front unchange, if found, swap
        int secLargest = front;
        for(int i = front; i < nums.length; i++){
            if(nums[i] > nums[front] && (secLargest == front || nums[i] < nums[secLargest])){
                secLargest = i;
            }
        }

        if(secLargest != front){
            int tmp = nums[front];
            nums[front] = nums[secLargest];
            nums[secLargest] = tmp;
            front++;
        }
        
        //sort the element starting from front index
        for (int i = front; i < nums.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
    }
}
