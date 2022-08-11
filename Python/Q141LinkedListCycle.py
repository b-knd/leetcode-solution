# @b-knd (jingru0 on 11 August 2022 09:02:00

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        if head == None:
            return False
        
        slow = head
        fast = head.next
        while fast != None and fast.next != None:
            if slow == fast:
                return True
            
            slow = slow.next
            fast = fast.next.next
        
        return False

#Runtime: 67 ms, faster than 78.93% of Python3 online submissions for Linked List Cycle.
#Memory Usage: 17.5 MB, less than 94.20% of Python3 online submissions for Linked List Cycle.
