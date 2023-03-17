class Solution {
    public boolean isSubsequence(String s, String t) {
        //two pointers
        int left = 0;
        int right = 0;

        boolean found = true;
        while(left < s.length()){
            if(right >= t.length()){
                found = false;
                break;
            }
            if(s.charAt(left) == t.charAt(right)){
                left++;
                right++;
            } else{
                while(right < t.length() && s.charAt(left) != t.charAt(right)){
                    right++;
                }
                if(right >= t.length()){
                    found = false;
                    break;
                }
            }
        }
        return found;
    }
}
