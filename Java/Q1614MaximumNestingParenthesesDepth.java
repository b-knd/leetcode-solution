/*
@b-knd (jingru) on 03 August 2022 11:26:00
*/

class Solution {
  
    //solution using stack
    public int maxDepth(String s) {
        int max = 0;
        Stack<String> stack = new Stack<>();
        
        //if string is open parentheses, push to stack and update max, else pop from stack to remove opening parentheses
        for(String str: s.split("")){
            if(str.equals("(")){
                stack.push("(");
                max = Math.max(max, stack.size());
            } else if(str.equals(")")){
                stack.pop();
            }
        }
        return max;
    }
    //Runtime: 7 ms, faster than 8.64% of Java online submissions for Maximum Nesting Depth of the Parentheses.
    //Memory Usage: 42.8 MB, less than 6.68% of Java online submissions for Maximum Nesting Depth of the Parentheses.
  
    
    //string-based solution
    //similar to stack concept but using an integer variable instead of stack to keep track of depth
    public int maxDepth(String s) {
        int max = 0;
        int j = 0;
        for(Character c: s.toCharArray()){
            if(c == '('){
                j++;
            }
            if(c == ')'){
                max = Math.max(j, max);
                j -= 1;
            }
        }
        return max;
    }
    //Runtime: 1 ms, faster than 87.77% of Java online submissions for Maximum Nesting Depth of the Parentheses.
    //Memory Usage: 40 MB, less than 99.67% of Java online submissions for Maximum Nesting Depth of the Parentheses.
}


