# @b-knd (jingru) on 10 August 2022 10:19:00

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        if root != None:
            if root.left == None and root.right == None:
                return root
            
            temp = root.left
            root.left = self.invertTree(root.right)
            root.right = self.invertTree(temp)
            
        return root

# Runtime: 33 ms, faster than 91.55% of Python3 online submissions for Invert Binary Tree.
#Memory Usage: 13.8 MB, less than 57.29% of Python3 online submissions for Invert Binary Tree.        
        
        
