# @b-knd (jingru) on 11 August 2022 09:14:00

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        res = []
        self.preorder(root, res)
        return res
    
    def preorder(self, node: Optional[TreeNode], res: List[int]) -> List[int]:
        if node != None:
            res += [node.val]
            self.preorder(node.left, res)
            self.preorder(node.right, res)
    
#Runtime: 49 ms, faster than 47.64% of Python3 online submissions for Binary Tree Preorder Traversal.
#Memory Usage: 14 MB, less than 13.06% of Python3 online submissions for Binary Tree Preorder Traversal.
