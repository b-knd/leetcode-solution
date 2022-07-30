/*
@b-knd (jingru) on 30 July 2022 10:00:00
*/

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {         
        List<Integer> list1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
                                                                        
        return new ArrayList<>(List.of(difference(nums1,list2), difference(nums2,list1)));
    }
    
    
    public List<Integer> difference(int[] arr, List<Integer> list){
        List<Integer> res = new ArrayList<>();
        
        for(int i: arr){
            if(!res.contains(i) && !list.contains(i)){
                res.add(i);
            }
        }
        
        return res;
    }
}

//Runtime: 404 ms, faster than 6.66% of Java online submissions for Find the Difference of Two Arrays.
//Memory Usage: 43.2 MB, less than 88.02% of Java online submissions for Find the Difference of Two Arrays.
