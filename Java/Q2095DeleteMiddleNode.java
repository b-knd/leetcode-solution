/*
@b-knd (jingru) on 03 August 2022 10:13:00
*/

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        //if less than 2 nodes
        if(head == null || head.next == null){
            return null;
        }
        
        ListNode slow = head, prev = null;
        ListNode fast = head;
        
        //slow pointer move twice as slow as the fast pointer, making slow pointer pointing at the middle node when fast pointer reaches the end
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        //changing next pointer of previous to remove the slow node
        if(prev != null){
            prev.next = slow.next;
        }
        return head;
    }
}

//Runtime: 4 ms, faster than 96.41% of Java online submissions for Delete the Middle Node of a Linked List.
//Memory Usage: 63.2 MB, less than 95.40% of Java online submissions for Delete the Middle Node of a Linked List.
