/*
@b-knd (jingru) on 01 August 2022 11:11:00
*/

class Solution {

    //Solution using stack (two pass)
    public int pairSum(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;
        int max = 0;
        
        //push value to stack 
        while(temp != null){
            stack.push(temp.val);
            temp = temp.next;
        }
        
        //traverse linked list once again adding value with first element in stack using pop(), find max of sum using Math.max
        temp = head;
        while(temp != null){
            max = Math.max(max, temp.val+stack.pop());
            temp = temp.next;
        }
        
        return max;
    }
    
    //Solution using arraylist 
    public int pairSum(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while(head != null) {
            list.add(head.val);
            head = head.next;
        }
        int n = list.size();
        int max = 0;
        for(int i = 0; i < n/2; i++) {
            max = Math.max(max, list.get(i) + list.get(n - 1 - i));
        }
        return max;
    }
}
