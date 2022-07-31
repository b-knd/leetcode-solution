/*
    @b-knd (jingru) on 31 July 2022 10:10:00
    
    Concept:
    - having three pointer: curr, prev and next
    - basically change next pointer to make it point to previous node (prev pointer)
    - prev pointer always points to the last modified node (beginning of the reversed part of the list)
    - then advance curr to the next node in original list
*/

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head, prev = null, next = null;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
    
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
    //Memory Usage: 43.2 MB, less than 27.01% of Java online submissions for Reverse Linked List.
}
