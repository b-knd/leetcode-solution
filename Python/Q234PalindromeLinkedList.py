# @b-knd (jingru) on 11 August 2022 10:02:00

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        elemList = []
        while head != None:
            elemList.append(head.val)
            head = head.next
        
        start = 0
        end = len(elemList)-1
        
        while start < end:
            if elemList[start] != elemList[end]:
                return False
            start += 1
            end -= 1
        return True
        
#    Runtime: 1215 ms, faster than 50.29% of Python3 online submissions for Palindrome Linked List.
#Memory Usage: 46.8 MB, less than 29.04% of Python3 online submissions for Palindrome Linked List.    
