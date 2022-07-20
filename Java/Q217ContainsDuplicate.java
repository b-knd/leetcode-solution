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
