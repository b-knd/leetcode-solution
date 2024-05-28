# @b-knd (jingru) on 28 May 2024 17:16:00

# """
# This is the interface that allows for creating nested lists.
# You should not implement it, or speculate about its implementation
# """
#class NestedInteger(object):
#    def __init__(self, value=None):
#        """
#        If value is not specified, initializes an empty list.
#        Otherwise initializes a single integer equal to value.
#        """
#
#    def isInteger(self):
#        """
#        @return True if this NestedInteger holds a single integer, rather than a nested list.
#        :rtype bool
#        """
#
#    def add(self, elem):
#        """
#        Set this NestedInteger to hold a nested list and adds a nested integer elem to it.
#        :rtype void
#        """
#
#    def setInteger(self, value):
#        """
#        Set this NestedInteger to hold a single integer equal to value.
#        :rtype void
#        """
#
#    def getInteger(self):
#        """
#        @return the single integer that this NestedInteger holds, if it holds a single integer
#        Return None if this NestedInteger holds a nested list
#        :rtype int
#        """
#
#    def getList(self):
#        """
#        @return the nested list that this NestedInteger holds, if it holds a nested list
#        Return None if this NestedInteger holds a single integer
#        :rtype List[NestedInteger]
#        """

class Solution(object):
    def deserialize(self, s):
        """
        :type s: str
        :rtype: NestedInteger
        """
        stack = []
        num, sign = None, 1 #assuming sign is positive

        for char in s:
            if char == '[':
                #start of a nested integer
                stack.append(NestedInteger())
            elif char == ']':
                #end of a nested integer
                if num is not None:
                    stack[-1].add(NestedInteger(num * sign))
                    num = None
                    sign = 1
                if stack:
                    #sort out hierarchy in stack
                    nested = stack.pop()
                    if stack:
                        stack[-1].add(nested)
                    else:
                        #base case, return stack content
                        return nested
            elif char == ',':
                #next element in list (can append current integer)
                if num is not None:
                    stack[-1].add(NestedInteger(num * sign))
                    num = None #restart
                    sign = 1
            elif char == '-':
                sign = -1
            else:
                if num is not None:
                    num = num * 10 + int(char)
                else:
                    num = int(char)
        if num is not None:
            return NestedInteger(num * sign)
        return None
