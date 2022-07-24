/*
@b-knd (jingru) on 18 July 2022
*/

/*
Concept:
- Using hashmap to keep track of each elements total count
- Loop through hashmap, find how many pair using count / 2, find leftover using count % 2
*/

import java.util.Arrays;
import java.util.HashMap;

public class Q2341MaximumNumberofPairsinArray {

    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int i: nums){
            count.put(i, count.getOrDefault(i, 0)+1);
        }
        int pairCount = 0;
        int leftOverCount = 0;
        for(int i: count.values()){

            pairCount += i / 2;
            leftOverCount += i % 2;
        }
        return new int[] {pairCount, leftOverCount};
    }
}
