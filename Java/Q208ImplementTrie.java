class Node {
    public String val;
    public List<Node> children;
    public Node() {}
    public Node(String _val) {
        val = _val;
    }
    public Node(String _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

class Trie {
    public Node trie;

    public Trie() {
        //tree with a dummy root "*"
        this.trie = new Node("*", new ArrayList<Node>());
    }
    
    public void insert(String word) {
        Node curr = this.trie;
        //insert word into tree, mark the end of word with "*"
        for(char i: (word+"*").toCharArray()){
            List<Node> children = curr.children;
            if(children.size() == 0){
                Node next = new Node(String.valueOf(i), new ArrayList<Node>());
                curr.children.add(next);
                curr = next;
            } else{
                boolean flag = false;
                for(Node c: children){
                    if(i == c.val.charAt(0)){
                        curr = c;
                        flag = true;
                        break;
                    }
                }
                if(!flag){
                    Node next = new Node(String.valueOf(i), new ArrayList<Node>());
                    curr.children.add(next);
                    curr = next;
                }
            }
        }
    }
    
    public boolean search(String word) {
        //there must be a full word ending in "*", utilising startsWith function
        return startsWith(word+"*");
    }
    
    public boolean startsWith(String prefix) {
        Node curr = this.trie;
        //if complete string is found in the tree return true, else false
        for(char i: prefix.toCharArray()){
            boolean flag = false;
            List<Node> children = curr.children;
            for(Node c: children){
                if(i == c.val.charAt(0)){
                    flag = true;
                    curr = c;
                }
            }
            if(!flag){
                return false;
            }
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */Q
