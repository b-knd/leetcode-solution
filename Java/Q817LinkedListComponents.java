/*
@b-knd (jingru) on 02 August 2022 11:27:00
*/

class Solution {
    public int numComponents(ListNode head, int[] nums) {
        List<Integer> arrList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        
        int count = 0;
        while(head != null){
            Boolean found = false;
            while(head != null && arrList.contains(head.val)){
                found = true;
                head = head.next;
            }
            if(found){
                count++;
            }
            head = (head == null? null: head.next);
        }
        return count;
    }
}

//Runtime: 1420 ms, faster than 5.12% of Java online submissions for Linked List Components.
//Memory Usage: 54.4 MB, less than 34.42% of Java online submissions for Linked List Components.
