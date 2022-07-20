/*
@b-knd (jingru) on 20 July 2022 09:59:00
*/

import java.util.*;

class Q49GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        for(String str: strs){
            String[] arr = str.split("");
            Arrays.sort(arr);
            List<String> list = hm.getOrDefault(String.join("", arr), new ArrayList<String>());
            list.add(str);
            hm.put(String.join("", arr), list);
        }
        List<List<String>> res = new ArrayList<>();
        for(List<String> list: hm.values()){
            res.add(list);
        }
        return res;
    }
}
