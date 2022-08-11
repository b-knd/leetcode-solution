/*
@b-knd (jingru) on 11 August 2022 09:52:00
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

class Solution {
    int max = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return max;
    }

    public int maxDepth(TreeNode root){
        if(root == null) return 0;
        
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        
        //update max if left+right > max
        max = Math.max(max, left+right);
        
        //return masimum of left and right + 1 (root node)
        return Math.max(left, right) + 1;
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Diameter of Binary Tree.
//Memory Usage: 42.3 MB, less than 85.21% of Java online submissions for Diameter of Binary Tree.

