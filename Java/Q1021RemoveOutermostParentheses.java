/*
@b-knd (jingru) on 04 August 2022 09:10:00
*/

class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();
        int openPar = 0;
        
        /*
        - if openPar == 0 before increment means it is the first parentheses
        - if openPar <= 1 before decrement means it is the last right parentheses
        - and we do not append these two type of parentheses to result, thus removing the outermost parentheses
        */
        
        for(Character c: s.toCharArray()){
            if(c == '(' && openPar++ > 0) res.append(c);
            else if(c == ')' && openPar-- > 1) res.append(c);
        }
        
        return res.toString();
    }
}

//Runtime: 4 ms, faster than 81.22% of Java online submissions for Remove Outermost Parentheses.
//Memory Usage: 42.5 MB, less than 82.38% of Java online submissions for Remove Outermost Parentheses.
