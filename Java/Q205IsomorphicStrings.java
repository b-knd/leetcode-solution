class Solution {
    public boolean isIsomorphic(String s, String t) {
        //store mapping to hashmap and check if mapping is consistent in the entire string
        HashMap<Character, Character> hm = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(hm.containsKey(s.charAt(i))){
                if(hm.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            } else{
                hm.put(s.charAt(i), t.charAt(i));
            }
        }

        //do reverse checking
        hm = new HashMap<>();
        for(int i = 0; i < t.length(); i++){
            if(hm.containsKey(t.charAt(i))){
                if(hm.get(t.charAt(i)) != s.charAt(i)){
                    return false;
                }
            } else{
                hm.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }
}
