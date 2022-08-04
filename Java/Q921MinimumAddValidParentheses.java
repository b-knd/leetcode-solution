/*
@b-knd (jingru) on 10:27:00
*/

class Solution {
    public int minAddToMakeValid(String s) {
        int count = 0;
        Stack<Character> stack = new Stack<>();
        
        for(Character c: s.toCharArray()){
            if(c == '('){
                stack.push(c);
            } else{
                //stack.empty() means right parentheses is unbalanced, increment count
                //otherwise, pop from stack to remove one left parentheses (forming balanced pair with '(')
                if(stack.empty()){
                    count++;
                } else{
                    stack.pop();
                }
            }
        }
        //count keep track of unbalanced right parentheses, remaining stack.size() are the unbalanced left parentheses
        return count + stack.size();
    }
}

//Runtime: 2 ms, faster than 47.27% of Java online submissions for Minimum Add to Make Parentheses Valid.
//Memory Usage: 41.8 MB, less than 74.08% of Java online submissions for Minimum Add to Make Parentheses Valid.
