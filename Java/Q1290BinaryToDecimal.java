/*
@b-knd (jingru) on 31 July 2022 09:36:00
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

/*
    Walkthrough using example 1, [1, 0, 1]:
    - result is initiated to 1
    - next node: "0", res = (1 << 1) | 0 = (10) | 0 = 100 = 2
    - next node: "1", res = (2 << 1) | 1 = (100) | 1 = 101 = 5
    
    Complexity analysis:
    - time: O(N), while loop
    - space: O(N), no extra space used
*/

class Solution {
    public int getDecimalValue(ListNode head) {  
        //since the linked list is non-empty we can initiate result to the value of head
        //set current note to head (this will be updated in loop)
        int res = head.val;
        ListNode curr = head;
        
        //compute result using bitwise operator (leftshift and or)
        while(curr.next != null){
            curr = curr.next;
            res = (res << 1) | curr.val;
        }

        return res;
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Convert Binary Number in a Linked List to Integer.
//Memory Usage: 42.5 MB, less than 7.51% of Java online submissions for Convert Binary Number in a Linked List to Integer.
