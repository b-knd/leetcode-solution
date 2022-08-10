# @b-knd (jingru) on 10 August 2022 08:41:00

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        curr = head
        nextNode = None
        
        while curr != None:        
            nextNode = curr.next
            curr.next = prev
            prev = curr
            curr = nextNode
        
        return prev

#Runtime: 41 ms, faster than 86.59% of Python3 online submissions for Reverse Linked List.
#Memory Usage: 15.4 MB, less than 94.21% of Python3 online submissions for Reverse Linked List.
