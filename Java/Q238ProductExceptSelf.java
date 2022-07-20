/*
@b-knd (jingru) on 20 July 2022 10:37:00
*/

import java.util.*;

class Q238ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
      
        //first loop: accumulate product and update result array so that each index correspond to product of all elements before that index
        int product = 1;
        for(int i = 0; i < nums.length; i++){
            res[i] = product;
            product *= nums[i];
        }
        
        //second loop: accumulate product from end of array so that each index is being updated with multiplication between element in that index (result of first loop) and product of all elements after that index
        product = 1;
        for(int i = nums.length-1; i >= 0; i--){
            res[i] *= product;
            product *= nums[i];
        }
        return res;
    }
}

//first and second loop each runs in O(n) time, time complexity: O(n)
