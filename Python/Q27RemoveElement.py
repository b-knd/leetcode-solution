# @b-knd (jingru) on 08 August 2022 10:39:00

class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        k = 0;
        for i, value in enumerate(nums):
            if value != val:
                nums[k] = value
                k += 1
        return k

#Runtime: 17 ms, faster than 94.61% of Python online submissions for Remove Element.
#Memory Usage: 13.3 MB, less than 87.45% of Python online submissions for Remove Element.
