/*
@b-knd (jingru) on 22 July 2022 10:47:00
*/

import java.util.*;

class Q125ValidPalindrome {
    //concept: two pointers
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        
        /* 
        while start pointer and end pointer have not coincide (pointing at same element or crossover)
        - if both character are alphanumeric, check if they are the same character, then increment and decrement start and end pointer respectively
        - else (one of it is non-alphanumeric), increment or decrement pointers accordingly to make them point to next position
        */
        while(start < end){
            if(Character.isLetterOrDigit(s.charAt(start)) && Character.isLetterOrDigit(s.charAt(end))){
                if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))){
                    return false;
                }
                start++;
                end--;
            } else{
                if(!Character.isLetterOrDigit(s.charAt(start))){
                    start++;
                }
                if(!Character.isLetterOrDigit(s.charAt(end))){
                end--;
                }
            }
        }    
        
        return true;
    }
}

//Runtime: 4 ms, faster than 89.31% of Java online submissions for Valid Palindrome.
//Memory Usage: 43.5 MB, less than 71.83% of Java online submissions for Valid Palindrome.
