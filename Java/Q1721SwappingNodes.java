/*
@b-knd (jingru) on 01 August 2022 17:28:00
*/

class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode frontNode = head, rearNode = head, temp = head;
        int size = 0;
      
        //use first while loop to find frontNode to be swapped and size of the linked list;
        while(temp != null){
            size++;
            if(size < k){
                frontNode = frontNode.next;
            }
            temp = temp.next;
        }
      
        //use second while loop to find rearNode to be swapped  
        int count = 1;
        while(count < size-k+1){
            rearNode = rearNode.next;
            count++;
        }
        
        //swap node values
        int temp2 = frontNode.val;
        frontNode.val = rearNode.val;
        rearNode.val = temp2;
        
        return head;
    }
}

//Runtime: 3 ms, faster than 86.82% of Java online submissions for Swapping Nodes in a Linked List.
//Memory Usage: 178.7 MB, less than 62.19% of Java online submissions for Swapping Nodes in a Linked List.
