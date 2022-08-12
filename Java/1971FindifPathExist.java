class DisjointSetUnion {
    private int[] parent;
    private int N;
    
    public DisjointSetUnion(int n){
        this.N = n;
        parent = new int[this.N];
        for(int i = 0; i < this.N; i++){
            //set each element's parent to itself (all elements are not in disjoint subsets with one element)
            parent[i] = i;
        }
    }
    
    public boolean areConnected(int u, int v){
        //two element are connected if they are in the same set
        return find(u) == find(v);
    }
    
    public void union(int u, int v){
        if(u != v){
            int a = find(u); //parent of u
            int b = find(v); //parent of v
            parent[a] = b;
        }
    }
    
    private int find(int u){
        int x = u;
        while(x != this.parent[x]){
            //keep on moving u up to find its base parent
            x = this.parent[x];
        }
        this.parent[u] = x;
        return x;
    }
}

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        DisjointSetUnion set = new DisjointSetUnion(n);
        for(int[] edge: edges){
            //union edges
            set.union(edge[0], edge[1]);
        }
        
        return set.areConnected(source, destination);
    }
}

//Runtime: 9 ms, faster than 98.82% of Java online submissions for Find if Path Exists in Graph.
//Memory Usage: 137.6 MB, less than 86.86% of Java online submissions for Find if Path Exists in Graph.
