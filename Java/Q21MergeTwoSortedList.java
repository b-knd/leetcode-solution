/*
@b-knd (jingru) on 31 July 2022 15:33:00

Complexity analysis:
- Time: O(N) where N is the total length of the two linked list
- Space: O(N)
*/

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //created a dummy head (to keep track of head of merged list)
        ListNode dummy = new ListNode();
        //pointer that keep track of current node, initate to empty node because not yet compare head of list 1 and 2
        ListNode curr = new ListNode();
        dummy.next = curr;
    

        while(list1 != null || list2 != null){
            /*
            1. If both not null:
            -- compare values and update next node of current
            -- advance current and list pointer to next node according to comparison result
            -- continue loop
            
            2. One of the list is already null (all elements have been added)
            -- pointer current's next to the rest of the other list
            -- terminate loop and return
            */
            if(list1 != null && list2 != null){
                if(list1.val <= list2.val){
                    curr.next = list1;
                    curr = curr.next;
                    list1 = list1.next;
                } else{
                    curr.next = list2;
                    curr = curr.next;
                    list2 = list2.next;
                }
            } else if(list1 == null){
                curr.next = list2;
                break;
            } else{
                curr.next = list1;
                break;
            }
        }
        return dummy.next.next;
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Two Sorted Lists.
//Memory Usage: 41.5 MB, less than 99.08% of Java online submissions for Merge Two Sorted Lists.
