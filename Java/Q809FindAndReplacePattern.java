/*
@b-knd (jingru) on 29 July 2022 10:01:00
*/

class Q809FindAndReplacePattern {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<String>();
        
        for(String str: words){
            if(match(str, pattern)){
                res.add(str);
            }
        }
        return res;
    }
    
    public Boolean match(String str, String pattern){
        /*
        Build a hashmap to check pattern with key as character in pattern and value as corresponding character in string
        The if/else conditions return false on two occasion
        - The character in string does not match value corresponding to character in pattern (eg. 'a' corresponds with 'b' in hashmap, but there is one 'a' that corresponds with a 'c' in string)
        - The character in pattern is new (have not been associated with any character in string), but the character in string has already appeared in hm (meaning it has been associated with another character in pattern)
          (eg. 'a' is a new character key in hashmap, corresponding to character 'c' in string, but there is already value 'c' in hashmap that has different key 'b')
        */
        HashMap<Character, Character> hm = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            if(!hm.containsKey(pattern.charAt(i))){
                if(hm.containsValue(str.charAt(i))){
                    return false;
                }
                hm.put(pattern.charAt(i), str.charAt(i));
            } else if(hm.get(pattern.charAt(i)) != str.charAt(i)){
                return false;
            }
        }
        return true;
    }
}

//Runtime: 2 ms, faster than 74.25% of Java online submissions for Find and Replace Pattern.
//Memory Usage: 43 MB, less than 57.14% of Java online submissions for Find and Replace Pattern.
