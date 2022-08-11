/*
@b-knd (jingru) on 11 August 2022 09:07:00
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
    int min = Integer.MAX_VALUE;
    TreeNode prev = null;
    
    public int minDiffInBST(TreeNode root) {
        findmin(root);
        return min;
    }
    
    public void findmin(TreeNode node){
        if(node.left != null){
            findmin(node.left);
        }
        if(prev != null){
            min = Math.min(min, Math.abs(prev.val-node.val));
        }
        prev = node;
        if(node.right != null){
            findmin(node.right);
        }
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Minimum Distance Between BST Nodes.
//Memory Usage: 41.8 MB, less than 47.42% of Java online submissions for Minimum Distance Between BST Nodes.
