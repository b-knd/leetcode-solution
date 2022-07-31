/*
@b-knd (jingru) on 31 July 2022 16:08:00
*/

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        int sizeA = size(headA), sizeB = size(headB);
        int diff = Math.abs(sizeA-sizeB);
        
        /*
        - when diff = 0 means both list are now of the same length and we can now traverse both to find common node
        - else we need to advance starting point of the longer list to reduce the difference to 0
        */
        while(diff > 0){
            if(sizeA > sizeB){
                headA = headA.next;
            } else {
                headB = headB.next;
            }
            diff--;
        }
        
        //traverse both linked list to find common node
        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
    
    //a helper function to find size of a linked list
    public int size(ListNode head){
        int len = 0;
        while(head != null){
            len++;
            head = head.next;
        }
        
        return len;
    }
}

//Runtime: 1 ms, faster than 99.72% of Java online submissions for Intersection of Two Linked Lists.
//Memory Usage: 56.2 MB, less than 6.90% of Java online submissions for Intersection of Two Linked Lists.
