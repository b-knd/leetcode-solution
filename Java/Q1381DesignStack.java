/*
@b-knd (jingru) on 04 AUgust 2022 10:06:00
*/

//alternative, faster solution (lazy increment O(1))
class CustomStack {
    Stack<Integer> stack = new Stack<>();
    int[] inc;
    int maxSize;

    public CustomStack(int maxSize) {
        inc = new int[maxSize];
        this.maxSize = maxSize;
    }
    
    public void push(int x) {
        if(stack.size() < maxSize){
            stack.push(x);
        }
    }
    
    public int pop() {
        int i = stack.size()-1;
        if(i < 0){
            return -1;
        } else if (i > 0){
            inc[i-1] += inc[i];
        }
        int res = stack.pop()+inc[i];
        inc[i] = 0;
        return res;
    }
    
    public void increment(int k, int val) {
        int i = Math.min(k, stack.size())-1;
        
        //last index where increment takes place
        if(i >= 0){
            inc[i] += val;
        }
    }
}

//Runtime: 5 ms, faster than 95.16% of Java online submissions for Design a Stack With Increment Operation.
//Memory Usage: 43.3 MB, less than 88.53% of Java online submissions for Design a Stack With Increment Operation.

/*---------------------------------------------------------------------------------------------------------------*/

//my submission
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
