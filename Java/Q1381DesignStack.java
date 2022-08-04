/*
@b-knd (jingru) on 04 AUgust 2022 10:06:00
*/

class CustomStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> temp = new Stack<>();
    int maxSize;

    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
    }
    
    public void push(int x) {
        if(stack.size() < maxSize){
            stack.push(x);
        }
    }
    
    public int pop() {
        if(stack.empty()){
            return -1;
        }
        return stack.pop();
    }
    
    public void increment(int k, int val) {
        while(!stack.empty()){
            temp.push(stack.pop());
        }
        
        while(stack.size() < k && !temp.empty()){
            stack.push(temp.pop()+val);
        }
        while(!temp.empty()){
            stack.push(temp.pop());
        }
    }
}

//Runtime: 277 ms, faster than 5.06% of Java online submissions for Design a Stack With Increment Operation.
//Memory Usage: 55.2 MB, less than 12.81% of Java online submissions for Design a Stack With Increment Operation.

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
