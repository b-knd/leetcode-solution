/*
@b-knd (jingru) on 10 August 20222 10:32:00
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
    TreeNode prev;
    
    public int getMinimumDifference(TreeNode root) {
        getMin(root);
        return min;
    }
    
    /*
    Concept:
    - use inorder traversal as inorder travel node in sorted increasing manner and we can find minimum by comparing current value and previous value
    */
    public void getMin(TreeNode node){
        if(node == null) return;
        getMin(node.left);
        if(prev != null) min = Math.min(Math.abs(node.val-prev.val), min);
        prev = node;
        getMin(node.right);
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Minimum Absolute Difference in BST.
//Memory Usage: 42.2 MB, less than 91.41% of Java online submissions for Minimum Absolute Difference in BST.
