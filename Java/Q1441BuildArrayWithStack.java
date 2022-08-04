/*
@b-knd (jingru) on 04 August 2022 09:35:00
*/

class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<Integer> list = Arrays.stream(target).boxed().toList();
        
        int count = 0;
        
        List<String> res = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            res.add("Push");
            if(list.contains(i)){
                //increment element count and check with target.length to stop traversing once full
                if(++count == target.length) break;
            } else{
                res.add("Pop");
            }
        }
        return res;
    }
}

//Runtime: 5 ms, faster than 7.39% of Java online submissions for Build an Array With Stack Operations.
//Memory Usage: 43.6 MB, less than 32.45% of Java online submissions for Build an Array With Stack Operations.
