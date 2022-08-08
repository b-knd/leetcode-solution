/*
@b-knd (jingru) on 08 August 2022 10:46:00
*/

class Solution {
    public boolean isUnivalTree(TreeNode root) {
        boolean left = (root.left == null || (root.val == root.left.val && isUnivalTree(root.left)));
        boolean right = (root.right == null || (root.val == root.right.val && isUnivalTree(root.right)));
        return left && right;
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Univalued Binary Tree.
//Memory Usage: 42.4 MB, less than 6.32% of Java online submissions for Univalued Binary Tree.
