/*
@b-knd (jingru) on 02 August 2022 10:17:00
*/

class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        
        //set head of the list to be the second node (this will be returned in the end)
        ListNode dummyHead = head.next;
        ListNode curr = head;
        ListNode prev = new ListNode();
        
        //change next link in while loop
        while(curr != null && curr.next != null){
            ListNode temp = curr.next;
            prev.next = temp;
            curr.next = curr.next.next;
            temp.next = curr;
            prev = curr;
            curr = curr.next;
        }
        return dummyHead;
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Swap Nodes in Pairs.
//Memory Usage: 42.6 MB, less than 5.73% of Java online submissions for Swap Nodes in Pairs.
