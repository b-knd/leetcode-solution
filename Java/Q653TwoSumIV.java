/*
@b-knd (jingru) on 10 August 2022 08:34:00
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

    public boolean findTarget(TreeNode root, int k) {
        List<Integer> arrList = new ArrayList<>();
        return dfs(root, k, arrList);
    }
    
    public boolean dfs(TreeNode node, int target, List<Integer> list){
        if(node != null){
            //contain complement that add up with node value to target
            if(list.contains(target-node.val)){
                return true;
            }
            //add node value to list and continue traversing 
            list.add(node.val);
            return dfs(node.left, target, list) || dfs(node.right, target, list);
        }
        return false;
    }
}

//Runtime: 73 ms, faster than 5.04% of Java online submissions for Two Sum IV - Input is a BST.
//Memory Usage: 50.6 MB, less than 72.16% of Java online submissions for Two Sum IV - Input is a BST.
