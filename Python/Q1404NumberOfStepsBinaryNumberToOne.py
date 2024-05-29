# @b-knd on 29-05-2024

class Solution(object):
    def stepRecurse(self, s, count):
        print(s, count)
        if int(s, 2) == 1:
            return count
        else:
            if s[-1] == '0':
                return self.stepRecurse(s[:-1], count+1)
            else:
                return self.stepRecurse(bin(int(s, 2)+1), count+1)

    def numSteps(self, s):
        """
        :type s: str
        :rtype: int
        """
        return self.stepRecurse(s, 0)
    
    
        
