/*
@b-knd (jingru) on 06 August 10:03:00
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
    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Root Equals Sum of Children.
//Memory Usage: 42.2 MB, less than 16.62% of Java online submissions for Root Equals Sum of Children.
