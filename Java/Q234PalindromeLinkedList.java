/*
@b-knd (jingru) on 31 July 2022 16:35:00
*/

class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arrList = new ArrayList<>();
        
        while(head != null){
            arrList.add(head.val);
            head = head.next;
        }
        
        int start = 0;
        int end = arrList.size()-1;
        while(start < end){
            if(arrList.get(start) != arrList.get(end)){
                return false;
            }
            start++;
            end--;
        }
        
        return true;
    }
}

//Runtime: 7 ms, faster than 66.29% of Java online submissions for Palindrome Linked List.
//Memory Usage: 54.9 MB, less than 94.08% of Java online submissions for Palindrome Linked List.
