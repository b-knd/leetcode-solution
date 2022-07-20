/*
@b-knd (jingru) on 20 July 2022 09:31:00
*/

import java.util.*;

/*
- Use a hashmap to keep count of element, if duplicates found return true
*/
class Q217ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i: nums){
            hm.put(i, hm.getOrDefault(i, 0)+1);
            if(hm.get(i) >= 2){
                return true;
            }
        }
        return false;
    }
}

//Runtime: 14 ms, faster than 52.64% of Java online submissions for Contains Duplicate.
//Memory Usage: 70.2 MB, less than 39.25% of Java online submissions for Contains Duplicate.
