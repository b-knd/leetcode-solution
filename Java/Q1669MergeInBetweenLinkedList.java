/*
b-knd (jingru) on 01 August 2022 on 15:33:00
*/

class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        //initiate dummyhead, set curr to be list1;
        ListNode dummyHead = new ListNode();
        ListNode curr = list1;
        dummyHead.next = curr;
        
        //keep on traversing curr until reaching index a
        for(int i = 1; i < a; i++){
            curr = curr.next;
        }
        
        //need to find the remaining of list 1 to be added to result
        //use for loop to find first of the remaining list
        ListNode temp = curr.next;
        for(int i = 0; i <= b-a; i++){
            temp = temp.next;
        }
        
        //add list2 to the linked list
        curr.next = list2;
        
        
        //traverse list2 until finding the tail node of list2, set its next pointer to be the head of the remaining list1 (temp)
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = temp;
        
        return dummyHead.next;
    }
}

//Runtime: 2 ms, faster than 87.18% of Java online submissions for Merge In Between Linked Lists.
//Memory Usage: 107.9 MB, less than 31.86% of Java online submissions for Merge In Between Linked Lists.
