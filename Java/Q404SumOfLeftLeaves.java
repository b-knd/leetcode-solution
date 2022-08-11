/*
@b-knd (jingru) on 11 August 2022 09:30:00
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
    
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        if(root == null) return 0;
        if(root.left != null){
            //update sum only if node is left leave
            if(root.left.left == null && root.left.right == null){
                sum += root.left.val;
            } else{
                sum += sumOfLeftLeaves(root.left);
            }  
        } 
        sum += sumOfLeftLeaves(root.right);
        
        return sum;
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Sum of Left Leaves.
//Memory Usage: 40.1 MB, less than 94.50% of Java online submissions for Sum of Left Leaves.
