//algorithm: bfs

class Solution {
    List<Integer> visited = new ArrayList<>();

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        bfs(0, rooms, new ArrayList<>());
        if(visited.size() == rooms.size()){
            return true;
        } 
        return false;
    }

    public void bfs(int rIdx, List<List<Integer>> rooms, List<Integer> toBeVisited) {
        
        visited.add(rIdx);

        //current room being visited
        List<Integer> keys = rooms.get(rIdx);
        for(Integer i: keys){
            if(!toBeVisited.contains(i) && !visited.contains(i)){
                toBeVisited.add(i);
            }
        }
        

        //visited all available rooms
        if(toBeVisited.size() == 0){
            return;
        }

        //visit next node
        int i = toBeVisited.get(0);
        toBeVisited.remove(0);

        bfs(i, rooms, toBeVisited);
    }
}
