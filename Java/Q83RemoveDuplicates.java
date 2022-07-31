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
        - if current value is same as the previous value, remove current node by pointing prev's next pointer to current's next, advance to next node
        - otherwise, advance previous and current node
        */
        while(curr != null){
            if(curr.val == prev.val){
                prev.next = curr.next;
            } else{
                prev = curr;
            }
            curr = curr.next;
        }
        return dummyHead;
    }
}

//Runtime: 1 ms, faster than 79.16% of Java online submissions for Remove Duplicates from Sorted List.
//Memory Usage: 45.2 MB, less than 5.56% of Java online submissions for Remove Duplicates from Sorted List.
