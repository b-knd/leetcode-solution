/*
@b-knd (jingru) on 26 July 2022 11:07:00
*/

import java.util.*;

class Solution {
    public char repeatedCharacter(String s) {
        ArrayList<Character> arrList = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            if(arrList.contains(s.charAt(i))){
                return s.charAt(i);
            } else{
                arrList.add(s.charAt(i));
            }
        }
        return '0';
    }
}
