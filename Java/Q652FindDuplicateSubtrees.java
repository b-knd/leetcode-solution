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
    //map for node frequency
    private Map<String, Integer> map = new HashMap<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> res = new ArrayList<>();
        traverse(root, res);
        return res;
    }


    public String traverse(TreeNode node, List<TreeNode> res){
        if(node == null){
            return "n";
        } else{
            //construct string for the subtree, used to check for duplication in hashmap and storing
            StringBuilder str = new StringBuilder();
            str.append(node.val).append(" ").append(traverse(node.left, res)).append(" ").append(traverse(node.right, res));

            //add result if there is already a simiilar subtree
            if(map.getOrDefault(str.toString(), 0) == 1){
                res.add(node);
            } 

            //incremenet frequency count of the subtree
            map.put(str.toString(),map.getOrDefault(str.toString(), 0)+1);

            return str.toString();
        }    
    }
}
