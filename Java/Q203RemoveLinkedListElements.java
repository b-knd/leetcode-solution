/*
@b-knd (jingru) on 31 July 2022 16:55:00
*/

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyhead = new ListNode();
        ListNode prev = dummyhead;
        ListNode curr = head;
        dummyhead.next = curr;
        
        /*
        - if current value is the same as value to be removed, set prev's next to current next (remove current node), and advace to next node for current
        - else, advance both previous and current node
        */
        while(curr != null){
            if(curr.val == val){
                prev.next = curr.next;
            } else{
                prev = prev.next;
            }
            curr = curr.next;
        }
        
        return dummyhead.next;
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Linked List Elements.
//Memory Usage: 43.3 MB, less than 89.50% of Java online submissions for Remove Linked List Elements.
