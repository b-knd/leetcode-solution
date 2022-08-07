/*
@b-knd (jingru) on 07 August 2022 15:55:00
*/

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }
    
    public void inorder(TreeNode node, List<Integer> res){
        if(node != null){
            inorder(node.left, res);
            res.add(node.val);
            inorder(node.right, res);
        }
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Inorder Traversal.
//Memory Usage: 40.6 MB, less than 88.04% of Java online submissions for Binary Tree Inorder Traversal.
