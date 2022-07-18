/*
b-knd (jingru) on 10 July 2022 12:58:00
Referred to solution by fan_of_emptyhope (https://leetcode.cn/problems/move-pieces-to-obtain-a-string/solution/by-fan_of_emptyhope-vbxn/)
*/

/*
Question: 
You are given two strings start and target, both of length n. Each string consists only of the characters 'L', 'R', and '_' where:

The characters 'L' and 'R' represent pieces, where a piece 'L' can move to the left only if there is a blank space directly to its left, and a piece 'R' can move to the right only if there is a blank space directly to its right.
The character '_' represents a blank space that can be occupied by any of the 'L' or 'R' pieces.
Return true if it is possible to obtain the string target by moving the pieces of the string start any number of times. Otherwise, return false.
*/

public class Q2337MovePiecestoObtainaString {
    public boolean canChange(String start, String target) {
        if(!start.replaceAll("[^LR]", "").equals(target.replaceAll("[^LR]", ""))){
            return false;
        }

        int startRight=0,startLeft=0,targetRight=0,targetLeft=0;
        for(int i=0;i<start.length();i++){
            if(target.charAt(i) == 'R')targetRight++;
            else if(target.charAt(i)=='L')targetLeft++;
            if(start.charAt(i)=='R')startRight++;
            else if(start.charAt(i)=='L')startLeft++;

            //no need to consider sequence of "L" "R" as we already eliminated those in the first if statement
            if(targetRight>startRight)return false; //target right comes first, but since we cannot shift "R" left so return false
            if(targetLeft<startLeft)return false; //target left comes later, but since we cannot shift "L" right so return true
        }   return true;
    }
}
