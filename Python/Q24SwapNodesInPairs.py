# @b-knd (jingru) on 07 August 2022 16:11:00

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def swapPairs(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None or head.next == None:
            return head
        
        dummyHead = head.next
        curr = head
        prev = ListNode(0)
    
        while curr != None and curr.next != None:
            prev.next = curr.next
            temp = curr.next
            curr.next = curr.next.next
            temp.next = curr
            prev = curr
            curr = curr.next
            
        return dummyHead
            
#Runtime: 36 ms, faster than 84.86% of Python3 online submissions for Swap Nodes in Pairs.
#Memory Usage: 14 MB, less than 18.57% of Python3 online submissions for Swap Nodes in Pairs.
        
        
        
    
