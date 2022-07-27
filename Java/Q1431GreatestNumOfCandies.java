/*
@b-knd (jingru) on 27 July 2022 09:10:00
*/

import java.util.*;
import java.math.*;

class Q1431GreatestNumOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<Boolean>();
        int max = 0;
        for(int i: candies){
            max = Math.max(max, i);
        }
        
        for(int i: candies){
            res.add(i + extraCandies >= max);
        }
        return res;
    }
}

//Runtime: 1 ms, faster than 98.50% of Java online submissions for Kids With the Greatest Number of Candies.
//Memory Usage: 43.5 MB, less than 11.77% of Java online submissions for Kids With the Greatest Number of Candies.
