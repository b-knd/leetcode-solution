# @b-knd (jingru) on 07 August 2022 15:50:00

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        dummyHead = ListNode(0)
        curr = dummyHead
        
        while list1 != None or list2 != None:
            if list1 != None and list2 != None:
                if list1.val <= list2.val:
                    curr.next = list1
                    list1 = list1.next
                else:
                    curr.next = list2
                    list2 = list2.next
                curr = curr.next
            elif list1 == None:
                curr.next = list2
                break
            else:
                curr.next = list1
                break
        
        return dummyHead.next
    
#Runtime: 58 ms, faster than 52.60% of Python3 online submissions for Merge Two Sorted Lists.
#Memory Usage: 13.9 MB, less than 79.56% of Python3 online submissions for Merge Two Sorted Lists.
        
