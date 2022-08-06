/*
@b-knd (jingrh) on 06 August 2022 10:36:00
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
    public boolean evaluateTree(TreeNode root) {
        if(root.val == 1){
            return true;
        } else if(root.val == 0){
            return false;
        }
        boolean l = evaluateTree(root.left);
        boolean r = evaluateTree(root.right);
        return root.val == 2? l|r : l&r;
    }
}

//Runtime: 1 ms, faster than 61.79% of Java online submissions for Evaluate Boolean Binary Tree.
//Memory Usage: 46.5 MB, less than 56.93% of Java online submissions for Evaluate Boolean Binary Tree.

