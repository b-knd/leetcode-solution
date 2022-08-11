/*
@b-knd (jingru) on 11 August 2022 08:57:00
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

//using inorder traversal to check if the current value is smaller/equal to previous value (as inorder travel node in increasing order)
class Solution {
    TreeNode prev = null;
    
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        
        if(!isValidBST(root.left)) return false;
        if(prev != null && root.val <= prev.val) return false;
        prev = root;
        if(!isValidBST(root.right)) return false;
        
        return true;
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Validate Binary Search Tree.
//Memory Usage: 44.1 MB, less than 35.72% of Java online submissions for Validate Binary Search Tree.
