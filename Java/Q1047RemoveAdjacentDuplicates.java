/*
@b-knd (jingru) on 04 August 2022 09:47:00
*/

class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder res = new StringBuilder();
        
        for(Character c: s.toCharArray()){
            //duplicates found, remove from stack
            if(!stack.empty() && c == stack.peek()){
                stack.pop();
            } else{
                stack.push(c);
            }
        }
        
        //remaining element in stack are the result (reversed if pop one by one)
        while(!stack.empty()){
            res.append(stack.pop());
        }
        res.reverse();
        return res.toString();
    }
}

//Runtime: 85 ms, faster than 53.22% of Java online submissions for Remove All Adjacent Duplicates In String.
//Memory Usage: 56.5 MB, less than 29.91% of Java online submissions for Remove All Adjacent Duplicates In String.
