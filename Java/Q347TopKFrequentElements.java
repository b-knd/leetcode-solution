/*
@b-knd (jingru) on 20 July 2-22 10:11:00
*/

import java.util.*;

class Q347TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        //use hashmap to store frequency (key being the element itself and value are the frequencies)
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i: nums){
            hm.put(i, hm.getOrDefault(i, 0)+1);
        }
        
        //use priority queue to store value based on their frequency descendingly
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b) -> b[0]-a[0]);
        for(int i: hm.keySet()){
            queue.add(new int[] {hm.get(i), i});
        }
         
        //obtain the first k elements from priority queue and add to result array
        int[] res = new int[k];
        for(int i = 0; i < res.length; i++){
            res[i] = queue.poll()[1];
        }
        return res;
    }
}

/*
- O(n) time to initiate hashmap by looping through array
- Less than O(nlogn) time to insert into priority queue and to delete from it
- So time complexity is O(nlogn)
*/
