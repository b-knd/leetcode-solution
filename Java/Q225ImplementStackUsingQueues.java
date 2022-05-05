package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class Q225ImplementStackUsingQueues {
    Queue<Integer> queue;
    public static void main(String[] args) throws Exception {
        Q225ImplementStackUsingQueues obj = new Q225ImplementStackUsingQueues();
        obj.push(2);
        int param_2 = obj.pop();
        int param_3 = obj.top();
        boolean param_4 = obj.empty();
        System.out.println(param_2);
        System.out.println(param_3);
        System.out.println(param_4);
    }
    public Q225ImplementStackUsingQueues() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
        for(int i = 1; i < queue.size(); i++){
            queue.add(queue.remove());
        }
    }

    public int pop() {
        return queue.remove();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
