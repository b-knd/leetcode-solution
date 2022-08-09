# @b-knd (jingru) on 09 AUgust 2022 10:59:00

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> Optional[ListNode]:
        headAsize = self.getSize(headA)
        headBsize = self.getSize(headB)
        diff = abs(headAsize - headBsize)
        
        # we find different in size of the two linked list, and make them start at a specific point such that length till the end are equals
        while diff > 0:
            if headAsize > headBsize:
                headA = headA.next
            else:
                headB = headB.next
            diff -= 1
        
        #return node if found intersection otherwise return None
        while headA != None:
            if headA == headB:
                return headA
            headA = headA.next
            headB = headB.next
            
        return None
    
    #helper function to get size of linked list
    def getSize(self, head: ListNode) -> int:
        size = 0
        while head != None:
            size += 1
            head = head.next
        return size

#Runtime: 263 ms, faster than 38.55% of Python3 online submissions for Intersection of Two Linked Lists.
#Memory Usage: 29.7 MB, less than 50.66% of Python3 online submissions for Intersection of Two Linked Lists.  
