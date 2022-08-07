# @b-knd (jingru) on 07 August 2022 14:49:00

class Solution(object):
    def twoSum(self, nums, target):
        complements = {};

        for i, value in enumerate(nums):
            complement = target - nums[i]
            if complement in complements:
                return [i, complements[complement]]
            else:
                complements[value] = i

    
#Runtime: 37 ms, faster than 99.07% of Python online submissions for Two Sum.
#Memory Usage: 14.5 MB, less than 22.61% of Python online submissions for Two Sum.
