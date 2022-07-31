/*
@b-knd (jingru) on 31 July 2022 10:25:00
*/

class MyHashSet {
    ArrayList<Integer> hashset;

    public MyHashSet() {
        hashset = new ArrayList<>();
    }
    
    public void add(int key) {
        hashset.add(key);
    }
    
    public void remove(int key) {
        if(hashset.contains(key)){
            hashset.removeAll(List.of(key));
        }
    }
    
    public boolean contains(int key) {
        return hashset.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
