/*
@b-knd (jingru) 06 August 2022 10:14:00
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/*
Concept:
- Inorder traversal, order: left -> root -> right
*/

class Solution {
    TreeNode ans, target;
    
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        this.target = target;
        inorder(original, cloned);
        return ans;
    }
    
    public void inorder(TreeNode original, TreeNode cloned){
        if(original != null){
            inorder(original.left, cloned.left);
            if(original == target) {
                ans = cloned;
                return;
            }
            inorder(original.right, cloned.right);
        }
    }
}

//Runtime: 2 ms, faster than 84.23% of Java online submissions for Find a Corresponding Node of a Binary Tree in a Clone of That Tree.
//Memory Usage: 101.8 MB, less than 53.69% of Java online submissions for Find a Corresponding Node of a Binary Tree in a Clone of That Tree.
