/*
    @b-knd (jingru) on 31 July 2022 10:01:00
    
    Concept:
    - set value of the node to be deleted to be value of the next node
    - then change next pointer to next next node (removing the next node)
*/


class Solution {
    
    //O(1) time and space
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
    
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Delete Node in a Linked List.
    //Memory Usage: 44.2 MB, less than 32.01% of Java online submissions for Delete Node in a Linked List.
}
