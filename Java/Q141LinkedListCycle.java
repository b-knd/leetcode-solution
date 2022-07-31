/*
@b-knd (jingru) on 31 July 2022 16:44:00
*/

public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        
        ListNode slow = head, fast = head.next;
        while(fast != null && fast.next != null){
            if(slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return false; 
    }
}

//Runtime: 1 ms, faster than 45.98% of Java online submissions for Linked List Cycle.
//Memory Usage: 45.8 MB, less than 52.12% of Java online submissions for Linked List Cycle.
