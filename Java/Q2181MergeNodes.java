/*
@b-knd (jingru) on 01 Auguest 2022 10:59:00
*/

class Solution {
    public ListNode mergeNodes(ListNode head) {
      
        //initiate dummy nodes
        ListNode dummyhead = new ListNode();
        ListNode curr = head;
        dummyhead.next = curr;
        
        //use while loop to traverse the linked list
        while(head != null){
           
            int sum = 0;
          
            //use while loop to traverse non-zero node and add up their sum
            while(head.val != 0){
                sum += head.val;
                head = head.next;
            }
            //add sum of non-zeros values, create a new node, add to linked list and proceed to next node
            if(sum > 0){
                curr.next = new ListNode(sum);
                curr = curr.next;
            }
            head = head.next;
        }
        
        return dummyhead.next.next;
    }
}

//Runtime: 7 ms, faster than 94.27% of Java online submissions for Merge Nodes in Between Zeros.
//Memory Usage: 73 MB, less than 95.02% of Java online submissions for Merge Nodes in Between Zeros.
