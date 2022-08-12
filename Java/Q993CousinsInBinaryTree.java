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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            Queue<TreeNode> temp = new LinkedList<>();
            int count = 0;
            boolean currParent;
            TreeNode node;
            
            while(!queue.isEmpty()){
                currParent = false;
                node = queue.poll();
                
                if(node.left != null){
                    if(node.left.val == x || node.left.val == y){
                        currParent = true;
                        count++;
                    }
                    temp.add(node.left);
                }
                if(node.right != null){
                    if(node.right.val == x || node.right.val == y){
                        //they have the same parents
                        if(currParent) return false;
                        count++;
                    }
                    temp.add(node.right);
                }
            }
            //both target found and are counsins
            if(count == 2){
                return true;
            }
            queue = temp;
        }
        return false;
    }
}

//Runtime: 1 ms, faster than 66.10% of Java online submissions for Cousins in Binary Tree.
//Memory Usage: 42.2 MB, less than 28.29% of Java online submissions for Cousins in Binary Tree.
