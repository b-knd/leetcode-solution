/*
@b-knd (jingru) on 06 August 2022 16:17:00
*/

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        preorderTrav(root, ans);
        return ans;
    }
    
    public void preorderTrav(Node root, List<Integer> ans){
        if(root == null){
            return;
        }
        ans.add(root.val);
        for(Node c: root.children){
            preorderTrav(c, ans);
        }
    }
}

//Runtime: 1 ms, faster than 90.73% of Java online submissions for N-ary Tree Preorder Traversal.
//Memory Usage: 46 MB, less than 61.64% of Java online submissions for N-ary Tree Preorder Traversal.
