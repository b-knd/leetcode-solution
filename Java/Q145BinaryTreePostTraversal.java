/*
@b-knd (jingru) on 09:40:00
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        traverse(res, root);
        return res;
    }
    
    public void traverse(List<Integer> res, TreeNode node){
        if(node != null){
            traverse(res, node.left);
            traverse(res, node.right);
            res.add(node.val);
        }
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Postorder Traversal.
//Memory Usage: 42.1 MB, less than 60.14% of Java online submissions for Binary Tree Postorder Traversal.
