/*
@b-knd (jingru) on 03 August 2022 09:49:00
*/

class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        //traverse linked list to find length
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        
        //if len modulo k has remainder, means the first x elements (where x = remainder) will have extra one element than min (minimum element in each linked list)
        int remainder = len % k;
        int min = len / k;
        
        ListNode[] res = new ListNode[k];
        Arrays.fill(res, null);
        
        temp = head; ListNode temp2 = null;
        int index = 0;
        while(temp != null){
            //initiate size to min or min+1 if remainder > 0 (to distribute all element without leftover)
            int size = min;
            if(remainder > 0){
                size++;
                remainder--;
            }
            
            res[index] = temp;
            for(int i = 1; i < size; i++){
                temp = temp.next;
            }
          
            //continue with the rest of the nodes, ending current list by setting null as next, increment index
            if(temp != null){
                temp2 = temp.next;
                temp.next = null;
                temp = temp2;
            }
            index++;
        }
        return res;
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Split Linked List in Parts.
//Memory Usage: 42.2 MB, less than 96.14% of Java online submissions for Split Linked List in Parts.
