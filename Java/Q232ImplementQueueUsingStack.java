/*
@b-knd (jingru) on 04 August 2022 09:56:00
*/

class MyQueue {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public MyQueue() {
    }
    
    /*
    O(N) time:
    - transfer element from s2 to s1, put the new element at the bottom of s2, transfer element from s1 to s2
    - now element are in queue order in s2
    */
    public void push(int x) {
        while(!s2.empty()){
            s1.push(s2.pop());
        }
        s2.push(x);
        while(!s1.empty()){
            s2.push(s1.pop());
        }
    }
    
    //O(1)
    public int pop() {
        return s2.pop();
    }
    
    //O(1)
    public int peek() {
        return s2.peek();
    }
    
    //O(1)
    public boolean empty() {
        return s2.empty();
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Implement Queue using Stacks.
//Memory Usage: 41.7 MB, less than 67.82% of Java online submissions for Implement Queue using Stacks.

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
