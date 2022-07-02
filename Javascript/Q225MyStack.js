/*
Description:
Implement a last-in-first-out (LIFO) stack using only two queues. 
The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 
*/

var MyStack = function() {
    this.stack = [];
};

/** 
 * @param {number} x
 * @return {void}
 */
MyStack.prototype.push = function(x) {
    return this.stack.push(x);
};

/**
 * @return {number}
 */

MyStack.prototype.pop = function() {
    const temp = [];
    let len = this.stack.length;
    while(--len) {
        temp.push(this.stack.shift());
    }
    const ans = this.stack.shift();
    this.stack = temp;
    return ans;
};

/**
 * @return {number}
 */
MyStack.prototype.top = function() {
    const temp = [];
    let len = this.stack.length;
    while(--len) {
        temp.push(this.stack.shift());
    }
    const ans = this.stack.shift();
    temp.push(ans);
    this.stack = temp;
    return ans;
};

/**
 * @return {boolean}
 */
MyStack.prototype.empty = function() {
    return this.stack.length == 0;
};

//Runtime: 73 ms, faster than 65.27% of JavaScript online submissions for Implement Stack using Queues.
//Memory Usage: 41.9 MB, less than 42.46% of JavaScript online submissions for Implement Stack using Queues.
