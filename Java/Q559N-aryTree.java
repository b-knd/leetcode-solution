/*
@b-knd (jingru) on 07 August 2022 16:24:00
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
    int max = 0;
    
    public int maxDepth(Node root) {
        traverse(root, 0);
        return max;
    }
    
    public void traverse(Node root, int curr){
        if(root != null){
            //increment current depth and recurse on children nodes
            curr++;
            if(root.children != null){
                for(Node node: root.children){
                    traverse(node, curr);
                }
            } 
        }
        //update max in every recursion call
        max = Math.max(curr, max);
    }
}

//Runtime: 1 ms, faster than 83.49% of Java online submissions for Maximum Depth of N-ary Tree.
//Memory Usage: 44.5 MB, less than 29.63% of Java online submissions for Maximum Depth of N-ary Tree.
