/*
@b-knd (jingru) on 06 August 2022 04:10:00
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
    public List<Integer> postorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        postorderTrav(root, ans);
        return ans;
    }
    
    public void postorderTrav(Node root, List<Integer> ans){
        if(root == null){
            return;
        }
        for(Node c: root.children){
            postorderTrav(c, ans);
        }
        ans.add(root.val);
    }
}

//Runtime: 2 ms, faster than 54.81% of Java online submissions for N-ary Tree Postorder Traversal.
//Memory Usage: 46.7 MB, less than 10.99% of Java online submissions for N-ary Tree Postorder Traversal.
