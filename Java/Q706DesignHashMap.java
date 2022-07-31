/*
@b-knd (jingru) on 31 July 2022 03:16:00
*/

//Improved and faster implementation
class MyHashMap {
    int[] data;
    int size;
    
    //O(1)
    public MyHashMap() {
        data = new int[1];
        size = 1;
        data[0] = -1;
    }
    
    //O(N) on worst case if resizing is needed, O(1) on best case
    public void put(int key, int value) {
        if(key >= size){
            int[] newArr = new int[size + key + 1];
            Arrays.fill(newArr, -1);
            System.arraycopy(data, 0, newArr, 0, size);
            data = newArr;
            size = data.length;
        }
        data[key] = value;
    }
    
    //O(1) time
    public int get(int key) {
        if(key >= size){
            return -1;
        }
        return data[key];
    }
    
    //O(1) time
    public void remove(int key) {
        if(key < size){
            data[key] = -1;
        }
    }
}


/*----------------------------------------------------------------------------------------------------------------*/
// My implementation
// most of the function requires using the method indexOf which gives O(N) time complexity
class MyHashMap {
    ArrayList<Integer> keys, values; 

    public MyHashMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }
    
    public void put(int key, int value) {
        if(keys.contains(key)){
            int i = keys.indexOf(key);
            values.set(i, value);
        } else{
            keys.add(key);
            values.add(value);
        }
    }
    
    public int get(int key) {
        if(keys.contains(key)){
            return values.get(keys.indexOf(key));
        } else{
            return -1;
        }
    }
    
    public void remove(int key) {
        if(keys.contains(key)){
            int i = keys.indexOf(key);
            keys.remove(i);
            values.remove(i);
        }
    }
}
