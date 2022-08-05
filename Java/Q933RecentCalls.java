/*
@b-knd (jingru) on 05 August 2022 08:48:00
*/

class RecentCounter {
    Queue<Integer> queue;
    
    //initiate a queue to keep track of pings
    public RecentCounter() {
        queue = new LinkedList<>();
    }
    
    //remove all pings more than 3000 milliseconds before t using while loop and return queue size
    public int ping(int t) {
        queue.add(t);
        while(queue.size()>0 && queue.peek() < t-3000){
            queue.remove();
        }
        return queue.size();
    }
}

//Runtime: 33 ms, faster than 65.74% of Java online submissions for Number of Recent Calls.
//Memory Usage: 68.3 MB, less than 74.30% of Java online submissions for Number of Recent Calls.

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
