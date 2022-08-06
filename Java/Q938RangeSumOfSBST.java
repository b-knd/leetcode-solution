/*
@b-knd (jingru) on 06 August 2022 10:26:00
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
    int sum = 0, low, high;
  
    public int rangeSumBST(TreeNode root, int low, int high) {
        this.low = low;
        this.high = high;
        inorder(root);
        return sum;
    }
    
    public void inorder(TreeNode root){
        if(root != null){
            //if root value already smaller/equal to lower limit, we do not need to travel left node as all remaining will be out of range
            if(root.val > low){
                inorder(root.left);
            }
            //update sum if value falls in range
            if(root.val >= low && root.val <= high){
                sum += root.val;
            }
            //if root value larget/equal to upper limit, do not need to travel right nodes (def out of range)
            if(root.val < high){
                inorder(root.right);
            }
        }
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Range Sum of BST.
//Memory Usage: 67.6 MB, less than 26.16% of Java online submissions for Range Sum of BST.
