/*
@b-knd (jingru) on 27 July 2022 09:36:00
*/

//used some part of the concept of counting sort

class Q1365SmallerThenCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        //initiate an array to keep count of all elements in nums
        int[] arr = new int[101];
        for(int num: nums){
            arr[num]++;
        }
        
        //update array by cumulating sum
        for(int i = 1; i < arr.length; i++){
            arr[i] = arr[i] + arr[i-1];
        }
        
        //change the nums array to number of smaller elements than the current number
        //the array arr keep count of elements smaller/equals to each index (element), so to find element smaller than current, look at previous index 
        for(int i = 0; i < nums.length; i++){
            try{
                nums[i] = arr[nums[i]-1];
            } catch (ArrayIndexOutOfBoundsException e){
                nums[i] = 0;
            }
        }
        return nums;
    }
}

//Runtime: 2 ms, faster than 90.03% of Java online submissions for How Many Numbers Are Smaller Than the Current Number.
//Memory Usage: 42.3 MB, less than 95.53% of Java online submissions for How Many Numbers Are Smaller Than the Current Number.
