/*
@b-knd (jingru) on 02 August 2022 10:24:00
*/

class Solution {
    int size;
    ArrayList<Integer> list;
    
    //initiate list by adding all element in linked list
    public Solution(ListNode head) {
        list = new ArrayList<>();
        
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
    }
    
    //randomly generate an index and return the value
    public int getRandom() {
        int k = new Random().nextInt(list.size());
        
        return list.get(k);
    }
}

//Runtime: 10 ms, faster than 94.87% of Java online submissions for Linked List Random Node.
//Memory Usage: 43.5 MB, less than 98.32% of Java online submissions for Linked List Random Node.
