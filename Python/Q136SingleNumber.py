# @b-knd (jingru) on 09 August 2022 10:44:00

class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        ans = nums[0]
        for i, value in enumerate(nums[1:]):
            ans ^= value
        return ans
                
#Runtime: 172 ms, faster than 75.84% of Python3 online submissions for Single Number.
#Memory Usage: 16.7 MB, less than 50.74% of Python3 online submissions for Single Number.
