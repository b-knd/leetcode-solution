/*
b-knd (jingru) on 02 August 2022 09:46:00
*/

class Solution {
    public ListNode oddEvenList(ListNode head) {
        //when linked list is empty or only has one element
        if(head == null  ||  head.next == null){
            return head; 
        }
        
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        
        /*
        - set odd next to next odd number, advance odd pointer
        - set even next to next even number and advance even pointer
        */
        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        //link odd list to even list and return list
        odd.next = evenHead;
        return head;
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Odd Even Linked List.
//Memory Usage: 44.9 MB, less than 37.09% of Java online submissions for Odd Even Linked List.
