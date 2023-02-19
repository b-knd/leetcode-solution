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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }

        //if odd level push left then right, else push right then left
        int lvl = 1;

        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        
        List<List<Integer>> res = new ArrayList<>();

        while(s.size() > 0){
            List<Integer> list = new ArrayList<>();
            Stack<TreeNode> tmp = new Stack<>();

            //push left then right will add right node value before left node in the next iteration (stack), the sequence depending on current level
            if(lvl % 2 != 0){
                while(s.size() > 0){
                    TreeNode node = s.pop();
                    if(node != null){
                        list.add(node.val);
                        tmp.push(node.left);
                        tmp.push(node.right);
                    }
                }
            } else{
                while(s.size() > 0){
                    TreeNode node = s.pop();
                    if(node != null){
                        list.add(node.val);
                        tmp.push(node.right);
                        tmp.push(node.left);
                    }
                }
            }

            //increment level, reset stack for next iteration and add list for current level to result
            lvl += 1;
            s = tmp;
            if(list.size() > 0){
                res.add(list);
            }
        }
        return res;
    }
}
