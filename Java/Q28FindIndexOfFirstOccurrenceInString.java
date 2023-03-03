class Solution {
    public int strStr(String haystack, String needle) {
        for(int i = 0; i < haystack.length(); i++){
            //if found possible starting point, do checking
            if(needle.charAt(0) == haystack.charAt(i)){
                //pointer for needle
                int idx = 0;
                //pointer for haystack
                int pointer = i;
                boolean flag = true;
                while(idx < needle.length()){
                    if(pointer >= haystack.length()){
                        return -1;
                    }
                    if(needle.charAt(idx) == haystack.charAt(pointer)){
                        idx++;
                        pointer++;
                    } else{
                        //fail to find needle substring from curr starting point, return to for loop for next index
                        flag = false;
                        break;
                    }
                }
                //matching substring found, return starting index
                if(flag){
                    return pointer - (needle.length());
                }
            }
        }
        return -1;
    }
}
