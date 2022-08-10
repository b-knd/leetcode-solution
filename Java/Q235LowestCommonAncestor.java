/*
@b-knd (jingru) on 10 August 2022 09:24:00
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

class Solution {
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        /*
        - stop when one of the node is found, return root
        - stop when need to go separate way (eg. p smaller need to go left, q greater need to go right: return root)
        - go left if both smaller, go right if both greater
        */
        while(root != p && root != q){
            if(p.val < root.val && q.val > root.val || p.val > root.val && q.val < root.val){
                return root;
            } 
            if(p.val < root.val && q.val < root.val){
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return root;
    }
}

//Runtime: 4 ms, faster than 100.00% of Java online submissions for Lowest Common Ancestor of a Binary Search Tree.
//Memory Usage: 42.9 MB, less than 97.81% of Java online submissions for Lowest Common Ancestor of a Binary Search Tree.
