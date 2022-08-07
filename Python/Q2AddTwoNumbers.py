# @b-knd (jingru) on 07 August 2022 15:14:00

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        
        dummyHead = ListNode(0)
        curr = dummyHead
        carry = 0
        while l1 != None or l2 != None or carry > 0:
            x = l1.val if l1 else 0
            y = l2.val if l2 else 0
            currSum = x + y + carry
            newNode = ListNode(currSum % 10)
            carry = currSum // 10
            curr.next = newNode
            curr = curr.next
            l1 = l1.next if l1 else None
            l2 = l2.next if l2 else None
        return dummyHead.next

#Runtime: 84 ms, faster than 54.07% of Python online submissions for Add Two Numbers.
#Memory Usage: 13.6 MB, less than 17.39% of Python online submissions for Add Two Numbers.
