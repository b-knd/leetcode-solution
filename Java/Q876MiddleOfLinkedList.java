/*
    @b-knd (jingru) on 31 July 2022 09:56:00
    
    Concept:
    - having a pointer that travel twice as fast as the result node
    -when the pointer reach the end of the linked list, the result node is pointing at the middle node of the list
    
    Walkthrough on example 1:
    - res and pointer = 1
    -> res = 2, pointer = 3
    -> res = 3, pointer = 5 (pointer.next == null so exit loop and result node = 3)
    
    Walkthrough on example 2:
    - res and pointer = 1
    -> res = 2, pointer = 3
    -> res = 3, pointer = 5
    -> res = 4, pointer = null (exit loop, result = 4)
*/

class Solution {
    
    //O(N) time complexity for traversing list and O(N) space
    public ListNode middleNodeImproved(ListNode head) {
        ListNode res = head, pointer = head;
        while(pointer != null && pointer.next != null){
            res = res.next;
            pointer = pointer.next.next;
        }
        return res;
    }
    
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Middle of the Linked List.
    //Memory Usage: 42.6 MB, less than 6.03% of Java online submissions for Middle of the Linked List.
    
    
    /* 
    My submitted solution:
    - O(N) time and O(1) space but requires traversing the list two times 
    */
    public ListNode middleNode(ListNode head) {
        int length = 1;
        ListNode tail = head;
        while(tail.next != null){
            tail = tail.next;
            length++;
        }
        
        int mid = length/2;
        ListNode res = head;
        while(mid > 0){
            mid--;
            res = res.next;
        }
        return res;
    }
}
