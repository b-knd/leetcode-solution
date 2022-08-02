/*
@b-knd (jingru) on 02 August 2022 11:08:00
*/

class Solution {
    public Node flatten(Node head) {
        flattenTail(head);
        return head;
    }
    
    public Node flattenTail(Node head){
        //first case: head is null, end of the list, return head
        if(head == null){
            return head;
        }
        //second case: head does not have child, proceed to flatten next if available or simply return head
        else if(head.child == null){
            if(head.next == null){
                return head;
            }
            return flattenTail(head.next);
        }
        /*
        third case: head has child
        - flatten child to find child tail (recursively) and remove child from head
        - if there is no next node, return tail
        - if next node exists, update link and continue flatten list
        */
        else{
            Node child = head.child;
            head.child = null;
            Node next = head.next;
            Node tail = flattenTail(child);
            head.next = child;
            child.prev = head;
            if(next != null){
                tail.next = next;
                next.prev = tail;
                return flattenTail(next);
            }
            return tail;
        }
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Flatten a Multilevel Doubly Linked List.
//Memory Usage: 43.1 MB, less than 5.75% of Java online submissions for Flatten a Multilevel Doubly Linked List.

