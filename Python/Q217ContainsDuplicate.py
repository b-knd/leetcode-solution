# @b-knd (jingru0 on 10 August 2022 08:56:00

class Solution:
    #unequal length means duplicated elements exists as set removes identical elements
    def containsDuplicate(self, nums: List[int]) -> bool:
        return len(nums) != len(set(nums))
    
#Runtime: 517 ms, faster than 80.37% of Python3 online submissions for Contains Duplicate.
#Memory Usage: 26.1 MB, less than 30.90% of Python3 online submissions for Contains Duplicate.
        
