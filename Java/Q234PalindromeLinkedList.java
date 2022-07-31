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
        
        ArrayList<Integer> temp = new ArrayList<>(arrList);
        Collections.reverse(temp);
        return temp.equals(arrList);
    }
}

//Runtime: 18 ms, faster than 34.48% of Java online submissions for Palindrome Linked List.
//Memory Usage: 61.4 MB, less than 85.95% of Java online submissions for Palindrome Linked List.
