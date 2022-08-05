/*
@b-knd (jingru) on 05 August 2022 10:01:00
*/

//since condition have string contains only lowercase english letter, set array to int[26], if not mentioned, need to have int[256]
class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        for(Character c: s.toCharArray()){
            count[c-'a']++;
        }
        
        //the first character to have count == 1 is unique
        for(int i = 0; i < s.length(); i++){
            if(count[s.charAt(i)-'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}

//Runtime: 10 ms, faster than 84.43% of Java online submissions for First Unique Character in a String.
//Memory Usage: 50.1 MB, less than 50.26% of Java online submissions for First Unique Character in a String.
