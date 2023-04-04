class Solution {
    public int partitionString(String s) {
        //user an arraylist to keep track of occurrences
        List<Character> list = new ArrayList<>();
        int count = 1;

        for(char c: s.toCharArray()){
            //if list already contains the character, start with a new list and increment result count
            //add current character to list
            if(list.contains(c)){
                count++;
                list = new ArrayList<>();
            } 
            list.add(c);
        }
        return count;
    }
}
