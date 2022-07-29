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
class Q2AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //initialise a dummy head, current node and carry
        ListNode head = new ListNode(0);
        ListNode curr = head;
        int carry = 0;
        
        //while loop that terminate only if both l1 and l2 is null and carry is 0
        while(l1 != null || l2 != null || carry > 0){
            //computer sum (considering and updating carry)
            int x = (l1 == null? 0: l1.val);
            int y = (l2 == null? 0: l2.val);
            int sum = x+y+carry;
            carry = sum / 10;
            
            //create new node and update current node
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            
            //advance l1 and l2 if they are not null
            l1 = (l1 == null? null: l1.next);
            l2 = (l2 == null? null: l2.next);
        }
        return head.next;
    }
}

//Runtime: 3 ms, faster than 78.30% of Java online submissions for Add Two Numbers.
//Memory Usage: 47.8 MB, less than 47.23% of Java online submissions for Add Two Numbers.
