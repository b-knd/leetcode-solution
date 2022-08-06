/*
@b-knd (jingru) on 06 August 2022 10:59:00
*/

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        while(root != null){
            if(val == root.val){
                return root;
            } else if(val < root.val){
                root = root.left;
            } else{
                root = root.right;
            }
        }
        return null;
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Search in a Binary Search Tree.
//Memory Usage: 51.4 MB, less than 55.73% of Java online submissions for Search in a Binary Search Tree.
