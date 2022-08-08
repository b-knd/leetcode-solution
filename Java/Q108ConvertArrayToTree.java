/**
/*
@b-knd (jingru) on 08 August 2022 11:02:00
*/

/* Definition for a binary tree node.
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length-1);
    }
    
    //concept: midpoint is the root/parent node and left part of array (smaller) is left node, right part be right node
    //use recursion to keep on taking mid, left part, right part before left and right pointer overlap (no more elements)
    public TreeNode helper(int[] nums, int start, int end){
        if(start > end){
            return null;
        }
        
        int mid = (start + end)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums, start, mid-1);
        node.right = helper(nums, mid+1, end);
        return node;
    }
}


//Runtime: 0 ms, faster than 100.00% of Java online submissions for Convert Sorted Array to Binary Search Tree.
//Memory Usage: 44.1 MB, less than 20.12% of Java online submissions for Convert Sorted Array to Binary Search Tree.
