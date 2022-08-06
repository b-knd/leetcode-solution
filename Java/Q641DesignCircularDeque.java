class MyCircularDeque {
    DoubleListNode head, tail;
    int size, k;

    public MyCircularDeque(int k) {
        size = 0; 
        this.k = k;
        head = new DoubleListNode(-1);
        tail = new DoubleListNode(-1);
        head.next = tail;
        tail.prev = head;
    }
    
    public boolean insertFront(int value) {
        if(size >= k) {
            return false;
        } else {
            DoubleListNode node = new DoubleListNode(value);
            node.next = head.next;
            head.next.prev = node;
            node.prev = head;
            head.next = node;
            size++;
            return true;
        }
    }
    
    public boolean insertLast(int value) {
        if(size >= k) {
            return false;
        } else {
            DoubleListNode node = new DoubleListNode(value);
            node.next = tail;
            node.prev = tail.prev;
            tail.prev.next = node;
            tail.prev = node;
            size++;
            return true;
        }
        
    }
    
    public boolean deleteFront() {
        if(size <= 0){
            return false;
        } else {
            head.next.next.prev = head;
            head.next = head.next.next;
            size--;
            return true;
        }
    }
    
    public boolean deleteLast() {
        if(size <= 0){
            return false;
        } else{
            tail.prev.prev.next = tail;
            tail.prev = tail.prev.prev;
            size--;
            return true;
        }
    }
    
    public int getFront() {
        return head.next.val;
    }
    
    public int getRear() {
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
    DoubleListNode prev;
    DoubleListNode next;
    int val;
    
    public DoubleListNode(int value){
        this.val = value;
    }
}

//Runtime: 4 ms, faster than 100.00% of Java online submissions for Design Circular Deque.
//Memory Usage: 43 MB, less than 87.52% of Java online submissions for Design Circular Deque.


/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */
