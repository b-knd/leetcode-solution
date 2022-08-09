/*
@b-knd (jingru) on 09 August 2022 10:39:00
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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> tree1 = new ArrayList<>();
        List<Integer> tree2 = new ArrayList<>();
        
        inorder(tree1, root1);
        inorder(tree2, root2);
        
        return tree1.equals(tree2);
    }
    
    public void inorder(List<Integer> res, TreeNode node){
        if(node != null){
            if(node.left == null && node.right == null){
                res.add(node.val);
            } else{
                inorder(res, node.left);
                inorder(res, node.right);
            }
        }
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Leaf-Similar Trees.
//Memory Usage: 42.3 MB, less than 25.08% of Java online submissions for Leaf-Similar Trees.
