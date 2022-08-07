/*
@b-knd (jingru) on 07 August 2022 15:07:00
*/

class Solution {
    
    public int sumRootToLeaf(TreeNode root) {
        int[] ans = new int[] {0};
        recurse(root, 0, ans);
        return ans[0];
    }
    
    
    public void recurse(TreeNode root, int curr, int[] ans){
        if(root != null){
            curr = curr << 1 | root.val;
            if(root.left == null && root.right == null){
                ans[0] += curr;
            } else{
                recurse(root.left, curr, ans);
                recurse(root.right, curr, ans);
            }
        }
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Sum of Root To Leaf Binary Numbers.
//Memory Usage: 42.6 MB, less than 54.96% of Java online submissions for Sum of Root To Leaf Binary Numbers.
