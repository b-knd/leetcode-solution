# @b-knd (jingru) on 07 August 2022 16:37:00

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        k = 0
        for i in range(1, len(nums)):
            if nums[i] != nums[k]:
                k+=1
                nums[k] = nums[i]
        return k+1
                
#Runtime: 91 ms, faster than 93.62% of Python3 online submissions for Remove Duplicates from Sorted Array.
#Memory Usage: 15.5 MB, less than 96.52% of Python3 online submissions for Remove Duplicates from Sorted Array.        
