/*
@b-knd (jingru) on 10 August 2022 08:48:00
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
    private int tiltSum;
    
    public int findTilt(TreeNode root) {
        tiltSum = 0;
        valueSum(root);
        return tiltSum;
    }
    
    public int valueSum(TreeNode root){
        //reach the end of the tree
        if(root == null){
            return 0;
        }
        //calculate tilt for current node and add to total sum
        int leftSum = valueSum(root.left);
        int rightSum = valueSum(root.right);
        int tilt = Math.abs(leftSum-rightSum);
        tiltSum += tilt;
        
        //return sum of tree from current node until the end
        return root.val + leftSum + rightSum;
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Tilt.
//Memory Usage: 42 MB, less than 94.72% of Java online submissions for Binary Tree Tilt.
