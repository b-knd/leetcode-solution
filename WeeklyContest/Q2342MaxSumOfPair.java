/*
@b-knd (jingru) on 18 July 2022 08:58:00
*/

/*
Concept:
- Using hashmap, store sum of digit with its respective max value (continue updating)
- Variable max to store current maximum sum
- Loop through array nums
-- update maximum value by adding current value and maximum value in hashmap after comparing
-- initiate or update hashmap by comparing maximum value for that number of digit
- Return variable max
*/

import java.util.HashMap;

class Q2342MaxSumOfPair {
    public int maximumSum(int[] nums) {

        HashMap<Integer,Integer> hm = new HashMap<>();
        int max = -1;
        for (int num : nums) {

            //current sum of digits
            int temp = sumDigit(num);

            //if map contains the same number of digit, update ans and hashmap
            if (hm.containsKey(temp)) {
                max = Math.max(max, num + hm.get(temp));
                hm.put(temp, Math.max(num, hm.get(temp)));
            } else {
                // Add the value in the map
                hm.put(temp, num);
            }
        }
        //return max sum
        return max;
    }

    //method to find sum of digit of an integer
    public int sumDigit(int n){
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
