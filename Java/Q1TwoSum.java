/*
@b-knd (jingru) on 20 July 2022 09:47:00
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Q1TwoSum {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int[] res = new int[2];
        for(int i = 0; i <= list.size(); i++){
            int complement = target - list.get(i);
            if(list.contains(complement) && i != list.indexOf(complement)){
                res[0] = i;
                res[1] = list.indexOf(complement);
                break;
            }
        }
        return res;
    }
}
