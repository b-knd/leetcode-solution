/*
@b-knd (jingru) on 06 August 2022 09:58:00
*/

class MyCircularQueue {
    DoubleListNode head, tail;
    int size, k;

    public MyCircularQueue(int k) {
        size = 0;
        this.k = k;
        head = new DoubleListNode(-1);
        tail = new DoubleListNode(-1);
        head.next = tail;
        tail.prev = head;
    }
    
    public boolean enQueue(int value) {
        if(size >= k){
            return false;
        }
        
        DoubleListNode node = new DoubleListNode(value);
        
        node.next = tail;
        node.prev = tail.prev;
        tail.prev.next = node;
        tail.prev = node;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(size < 1){
            return false;
        }
        
        head.next.next.prev = head;
        head.next = head.next.next;
        size--;
        return true;
    }
    
    public int Front() {
        return head.next.val;
    }
    
    public int Rear() {
        return tail.prev.val;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == k;
    }
}

class DoubleListNode {
    DoubleListNode prev, next;
    int val;
    
    public DoubleListNode(int val){
        this.val = val;
    }
}

//Runtime: 4 ms, faster than 91.94% of Java online submissions for Design Circular Queue.
//Memory Usage: 42.6 MB, less than 95.29% of Java online submissions for Design Circular Queue.

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
