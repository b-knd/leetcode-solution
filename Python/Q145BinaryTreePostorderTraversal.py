# @b-knd (jingru) on 11 August 2022 09:22:00

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def postorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        res = []
        self.postorder(root, res)
        return res
    
    def postorder(self, node: Optional[TreeNode], res: List[int]):
        if node != None:
            self.postorder(node.left, res)
            self.postorder(node.right, res)
            res += [node.val]
            
#Runtime: 36 ms, faster than 83.41% of Python3 online submissions for Binary Tree Postorder Traversal.
#Memory Usage: 13.8 MB, less than 96.68% of Python3 online submissions for Binary Tree Postorder Traversal.
