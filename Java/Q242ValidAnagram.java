/*
@b-knd (jingru) on 20 July 2022 09:36:00
*/

import java.util.*;

//Create two arrays for s and t, sort the array and compare the two strings formed using String.join()
class Q242ValidAnagram {
    public boolean isAnagram(String s, String t) {
        String[] s2 = s.split("");
        String[] t2 = t.split("");
        Arrays.sort(s2);
        Arrays.sort(t2);
        return String.join("", s2).equals(String.join("", t2));
    }
}
