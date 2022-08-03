/*
@b-knd (jingru) on 03 August 2022 10:55:00
*/

class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode dummyHead = new ListNode(0);
        ListNode leftEnd = dummyHead;
        ListNode rightStart = new ListNode(0), rightEnd = rightStart;
        
        ListNode curr = head;
        
        while(curr != null){
            //add curr to leftEnd if smaller than x, to rightEnd if larger or equal
            if(curr.val < x){
                leftEnd.next = curr;
                leftEnd = leftEnd.next;
            } else{
                rightEnd.next = curr;
                rightEnd = rightEnd.next;
            }
            //continue with next node
            curr = curr.next;
        }
        
        //remove nodes after rightEnd
        rightEnd.next = null;
        //linked left part and right together
        leftEnd.next = rightStart.next;
        
        return dummyHead.next;
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Partition List.
//Memory Usage: 43.2 MB, less than 13.40% of Java online submissions for Partition List.
