# @b-knd (jingru) on 09 August 2022 11:25:00

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeElements(self, head: Optional[ListNode], val: int) -> Optional[ListNode]:
        dummyHead = ListNode(0)
        curr = head
        dummyHead.next = curr
        prev = dummyHead
        
        while curr != None:
            while curr != None and curr.val == val:
                curr = curr.next
            prev.next = curr
            prev = curr
            if curr != None:
                curr = curr.next
        return dummyHead.next
    
#Runtime: 72 ms, faster than 92.62% of Python3 online submissions for Remove Linked List Elements.
#Memory Usage: 17.8 MB, less than 81.81% of Python3 online submissions for Remove Linked List Elements.
