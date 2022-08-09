# @b-knd (jingru) on 09 August 2022 09:54:00

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None:
            return head
        
        dummyHead = head
        prev = head
        curr = head.next
        
        while curr != None:
            #skip nodes that have the same value as previous node until: finish traversing list or found a different valued node
            while curr != None and curr.val == prev.val:
                curr = curr.next
            #change link and update previous
            prev.next = curr
            prev = curr
            #continue traversing if possible
            if curr != None:
                curr = curr.next    
            
        return dummyHead

#Runtime: 55 ms, faster than 72.87% of Python3 online submissions for Remove Duplicates from Sorted List.
#Memory Usage: 13.9 MB, less than 71.55% of Python3 online submissions for Remove Duplicates from Sorted List.
