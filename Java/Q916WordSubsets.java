/*
@b-knd (jingru) on 30 July 2022 08:42:00
*/

class Q916WordSubsets {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> res = new ArrayList<>();
        
        int[] target = new int[26];
        
        //build an array of target, that contains the maximum count of characters after looping through all string in words2
        for(String a: words2){
            int[] temp = new int[26];
            for(Character b: a.toCharArray()){
                temp[b-'a']++;
                target[b-'a'] = Math.max(temp[b-'a'], target[b-'a']);
            }
        }
        
        
        //build an array for each word, containing character count
        for(String b: words1){
            int[] arr = new int[26];
            for(Character c: b.toCharArray()){
                arr[c-'a']++;
            }
            if(isSubset(arr, target)){
                res.add(b);
            }
        }
        return res;
    }
    
    //a word is subset of another if and only if character count is smaller than or equals to character count of the target string
    public boolean isSubset(int[] a, int[] b){
        for(int i = 0; i < b.length; i++){
            if(b[i] > a[i]){
                return false;
            }
        }
        return true;
    }
}

//Runtime: 31 ms, faster than 73.58% of Java online submissions for Word Subsets.
//Memory Usage: 88.5 MB, less than 55.69% of Java online submissions for Word Subsets.
