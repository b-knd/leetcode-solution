# @b-knd (jingru) on 11 August 2022 10:08:00

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        while root != p and root != q:
            if p.val < root.val and q.val > root.val or p.val > root.val and q.val < root.val:
                return root
            if p.val < root.val and q.val < root.val:
                root = root.left
            else:
                root = root.right
        
        return root

#Runtime: 95 ms, faster than 78.79% of Python3 online submissions for Lowest Common Ancestor of a Binary Search Tree.
#Memory Usage: 18.9 MB, less than 22.99% of Python3 online submissions for Lowest Common Ancestor of a Binary Search Tree.
        
        
        
        
