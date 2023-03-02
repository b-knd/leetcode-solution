class Solution {

    public int compress(char[] chars) {

        int left = 0;
        int right = 0;
        int count = 0;
        int idx = 0;

        while(right < chars.length){
            if(chars[right] != chars[left]){
                chars[idx] = chars[left];
                idx++;
                idx = update(count, chars, idx);
                count = 0;
                left=right;
            } else{
                count++;
                if(right == chars.length-1){
                    chars[idx] = chars[left];
                    idx++;
                    idx = update(count, chars, idx);
                }
                right++;
            }

        }
        return idx;
    }

    public int update(int count, char[] chars, int idx){
        if(count > 1){
            if(count < 10){
                chars[idx] = (char) (count + '0');
                idx++;
            } else{
                char[] cntArr = (String.valueOf(count)).toCharArray();
                System.arraycopy(cntArr, 0, chars, idx, cntArr.length);
                idx += cntArr.length;
            }      
        }  
        return idx;          
    }
}
