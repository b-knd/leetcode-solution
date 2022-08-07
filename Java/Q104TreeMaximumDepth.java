/*
@b-knd (jingru) on 07 August 2022 15:20:00
*/

class Solution {
    int max = 0;
    public int maxDepth(TreeNode root) {
        recurse(root, 0);
        return max;
    }
    
    public void recurse(TreeNode root, int curr){
        if(root != null){
            curr++;
            if(root.left == null && root.right == null){
                max = Math.max(max, curr);
            } else{
                recurse(root.left, curr);
                recurse(root.right, curr);
            }
        }
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Depth of Binary Tree.
//Memory Usage: 43.1 MB, less than 50.26% of Java online submissions for Maximum Depth of Binary Tree.
