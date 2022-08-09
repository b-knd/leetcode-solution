/*
@b-knd (jingru) on 09 August 2022 11:17:00
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
    //avoid using string concatenation because it's costly
    // however, it's tricky to use stringbuilder as it is mutable, unlike string
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        
        dfs(res, str, root);
        
        return res;
    }
    
  
    public void dfs(List<String> res, StringBuilder curr, TreeNode node){
        if(node != null){
            //keep track of length before append
            int len = curr.length();
            curr.append(node.val);
            if(node.left == null && node.right == null){
                res.add(curr.toString());
            } else{
                curr.append("->");
                dfs(res, curr, node.left);
                dfs(res, curr, node.right);
            }
            //set back length to original before append
            curr.setLength(len);
        }
    }
}

//Runtime: 1 ms, faster than 100.00% of Java online submissions for Binary Tree Paths.
//Memory Usage: 43.3 MB, less than 54.76% of Java online submissions for Binary Tree Paths.
