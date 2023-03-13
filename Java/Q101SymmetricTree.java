
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
    public boolean isSymmetric(TreeNode root) {
        //do breadth first search, check palindromic string for each level
        Stack<TreeNode> stack = new Stack<>();
        //populate stack with root
        stack.push(root);
        Stack<TreeNode> temp = new Stack<>();

        //bfs
        while(stack.size() > 0){
            List<String> listNodes = new ArrayList<>();
            while(stack.size() > 0){
                TreeNode curr = stack.pop();
                if(curr == null){
                    listNodes.add("null");
                } else{
                    listNodes.add(String.valueOf(curr.val));
                    temp.push(curr.left);
                    temp.push(curr.right);
                }
            }
            //check if list is palindromic, if not return false straightaway, otherwise continue
            if(!isSymmetric(listNodes)){
                return false;
            }
            stack = temp;
            temp = new Stack<>();
        }
        return true;
    }

    //function to check if a given list is palindromic or not
    public boolean isSymmetric(List<String> list){
        List<String> copy = new ArrayList<>(list);
        Collections.reverse(copy);
        return copy.equals(list);
    }
}
