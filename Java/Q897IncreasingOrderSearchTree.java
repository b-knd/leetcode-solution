/*
@b-knd (jingr) on 06 August 2022 10:53:00
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
    //Concept: obtain value using inorder traversal (left -> root -> right), then reconstruct a new tree
  
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> vals = new ArrayList<>();
        inorder(root, vals);
        TreeNode ans = new TreeNode(0), curr = ans;
        for(int v: vals){
            curr.right = new TreeNode(v);
            curr = curr.right;
        }
        return ans.right;
    }
    
    public void inorder(TreeNode node, List<Integer> vals){
        if(node == null) return;
        inorder(node.left, vals);
        vals.add(node.val);
        inorder(node.right, vals);
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Increasing Order Search Tree.
//Memory Usage: 40 MB, less than 90.09% of Java online submissions for Increasing Order Search Tree.
