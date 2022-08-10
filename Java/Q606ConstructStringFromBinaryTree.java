/*
@b-knd (jingru) on 10 August 2022 10:05:00
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
    StringBuilder str = new StringBuilder();
    
    public String tree2str(TreeNode root) {
        preorder(root);
        return str.toString();
    }
    
    /*
    three cases:
    - if node = leaf node (no left and right child, append only the node value and return
    - if node does not have right node, preorder left child only (if no left node, we still need to preorder leftnode to create an empty bracket to signify empty left subtree)
    - otherwise, preorder left, append middle brackets and preorder right
    */
    public void preorder(TreeNode node){
        if(node != null){
            if(node.left == null && node.right == null){
                str.append(node.val);
                return;
            }
            str.append(node.val).append("(");
            if(node.right == null){
                preorder(node.left);
            } else{
                preorder(node.left);
                str.append(")").append("(");
                preorder(node.right);
            }
            str.append(")");
        }
    }
}

//Runtime: 2 ms, faster than 98.06% of Java online submissions for Construct String from Binary Tree.
//Memory Usage: 45.6 MB, less than 68.33% of Java online submissions for Construct String from Binary Tree.
