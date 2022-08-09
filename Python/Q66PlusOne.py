# @b-knd (jingru) on 09 August 2022 08:36:00

class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        if digits[-1] == 9:
            if len(digits) == 1:
                return [1, 0]
            else:
                return self.plusOne(digits[:-1]) + [0]
        else:
            digits[-1] += 1
            return digits

#Runtime: 31 ms, faster than 96.60% of Python3 online submissions for Plus One.
#Memory Usage: 13.9 MB, less than 58.70% of Python3 online submissions for Plus One.        
