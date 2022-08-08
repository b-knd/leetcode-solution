# @b-knd (jingru) on 08 August 2022 10:53:00

class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        start = 0
        end = len(nums)-1
        
        while end-start > 0:
            midpoint = (end+start)//2
            if nums[midpoint] == target:
                return midpoint
            elif nums[midpoint] < target:
                start = midpoint+1
            else:
                end = midpoint-1
                
        if target <= nums[start]:
            return start
        else:
            return start+1
#Runtime: 35 ms, faster than 99.97% of Python3 online submissions for Search Insert Position.
#Memory Usage: 14.7 MB, less than 41.44% of Python3 online submissions for Search Insert Position.    
