/*
@b-knd (jingru) on 07 August 2022 16:46:00
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
  
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root);
        while(!queue.isEmpty()){
            long sum = 0, count = 0;
            Queue<TreeNode> temp = new LinkedList<>();
            //queue now contains all nodes in same level, update sum and add their children in a temporary queue
            while(!queue.isEmpty()){
                TreeNode n = queue.remove();
                sum += n.val;
                count++;
                if(n.left != null){
                    temp.add(n.left);
                }
                if(n.right != null){
                    temp.add(n.right);
                }
                
            }
            queue = temp;
            //update res after looping through same-level nodes
            res.add(sum*1.0 / count);
        }
        return res;
    }
}

//Runtime: 3 ms, faster than 76.91% of Java online submissions for Average of Levels in Binary Tree.
//Memory Usage: 47.6 MB, less than 62.35% of Java online submissions for Average of Levels in Binary Tree.
