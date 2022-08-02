/*
@b-knd (jingru) on 02 August 2022 10:39:00
*/

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      
        //build two stack and add list node elements into the stack
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        
        while(l1 != null || l2 != null){
            if(l1 != null){
                s1.push(l1.val);
                l1 = l1.next;
            }
            if(l2 != null){
                s2.push(l2.val);
                l2 = l2.next;
            }
        }
        
        //build a new list from the tail node
        ListNode prev = null;
        ListNode head = null;
        int x, y, carry = 0, sum;
        while(!s1.empty() || !s2.empty() || carry > 0){
            x = (s1.empty()? 0: s1.pop());
            y = (s2.empty()? 0: s2.pop());
            sum = x + y + carry;
            if(head != null){
                prev = head;
            }
            head = new ListNode(sum % 10);
            head.next = prev;
            carry = sum/10;
        }
        return head;
    }
}

//Runtime: 7 ms, faster than 33.91% of Java online submissions for Add Two Numbers II.
//Memory Usage: 48.7 MB, less than 8.41% of Java online submissions for Add Two Numbers II.
