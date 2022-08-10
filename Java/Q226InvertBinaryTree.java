/*
@b-knd (jingru) on 07 August 2022 15:41:00
*/

class Solution {
    
    public TreeNode invertTree(TreeNode root){
        if(root != null){
            if(root.left == null && root.right == null){
                return root;
            }
            TreeNode temp = root.left;
            root.left = invertTree(root.right);
            root.right = invertTree(temp);
        }
        return root;
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Invert Binary Tree.
//Memory Usage: 42.3 MB, less than 10.76% of Java online submissions for Invert Binary Tree.

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Invert Binary Tree.
//Memory Usage: 42.1 MB, less than 20.66% of Java online submissions for Invert Binary Tree.
