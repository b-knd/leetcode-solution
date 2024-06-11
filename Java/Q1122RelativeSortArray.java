class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length];
        Map<Integer, Integer> occurrence = new HashMap<>();
        ArrayList<Integer> unsorted = new ArrayList<>();

        //initialise hashmap based on arr2, keep count of elements in arr1
        for(int i: arr2){
            occurrence.put(i, 0);
        }
        for(int i: arr1){
            if(occurrence.getOrDefault(i, -1) == -1){
                unsorted.add(i);
            } else{
                occurrence.put(i, occurrence.getOrDefault(i, 0)+1);
            }
        }

        //populate result array based on occurrence count and order in arr2
        int counter = 0;
        for(int i: arr2){
            //number of element in array 1
            int num = occurrence.get(i);
            for(int j = 0; j < num; j++){
                res[counter] = i;
                counter++;
            }
        }

        //sort remaining elements in arr1 and place at end of result array
        Collections.sort(unsorted);
        for(int i: unsorted){
            res[counter] = i;
            counter++;
        }

        return res;
    }
}
