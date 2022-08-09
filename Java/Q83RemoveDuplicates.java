/*
@b-knd (jingru) on 31 July 2022 16:20:00
*/

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyHead = head;
        if(head == null){
            return head;
        }
        ListNode prev = head;
        ListNode curr = head.next;
        
        /*
        - keep on traversing list until found a distinct value or finish with list
        - change node links, update prev node and continue traversing
        */
        while(curr != null){
            while(curr != null && curr.val == prev.val){
                curr = curr.next;
            }
            prev.next = curr;
            prev = curr;
            if(curr != null){
                curr = curr.next;
            }
        }
        return dummyHead;
    }
}

//Runtime: 1 ms, faster than 79.17% of Java online submissions for Remove Duplicates from Sorted List.
//Memory Usage: 44.4 MB, less than 36.35% of Java online submissions for Remove Duplicates from Sorted List.

