# @b-knd (jingru) on 07 August 2022 15:34:00

class Solution(object):
    def intToRoman(self, num):
        """
        :type num: int
        :rtype: str
        """
        res = "";
        
        value = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1]
        symbol = ["M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"]
        
        
        for i, value in enumerate(value):
            while num >= value:
                res += symbol[i]
                num -= value
            
        return res
    
#Runtime: 35 ms, faster than 94.21% of Python online submissions for Integer to Roman.
#Memory Usage: 13.6 MB, less than 14.87% of Python online submissions for Integer to Roman.
