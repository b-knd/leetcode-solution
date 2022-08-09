/*
@b-knd (jingru) on 09 August 2022 10:48:00
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
    
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        
        return res;
    }
    
    public void preorder(TreeNode node, List<Integer> res){
        if(node != null){
            res.add(node.val);
            preorder(node.left, res);
            preorder(node.right, res);
        }
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Preorder Traversal.
//Memory Usage: 40.4 MB, less than 95.61% of Java online submissions for Binary Tree Preorder Traversal.

