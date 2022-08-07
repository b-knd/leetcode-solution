/*
@b-knd (jingru) on 07 August 2022 14:29:00
*/

class Solution {
    //sliding window
    public int arithmeticTriplets(int[] nums, int diff) {
        int res = 0;
        List<Integer> arrList = Arrays.stream(nums).boxed().toList();
        for(int i = 0; i < arrList.size()-2; i++){
            if (arrList.contains(arrList.get(i) + diff) && arrList.contains(arrList.get(i) + diff + diff)) {
                res++;
            }
        }
        return res;
    }
}
