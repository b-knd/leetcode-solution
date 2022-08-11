/*
@b-knd (jingru) on 11 August 2022 09:18:00
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        
        if(p.val != q.val) return false;
        if(!isSameTree(p.left, q.left)) return false;
        if(!isSameTree(p.right, q.right)) return false;
        
        return true;
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Same Tree.
//Memory Usage: 40 MB, less than 86.21% of Java online submissions for Same Tree.
