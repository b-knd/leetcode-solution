class Solution {
    public int magicalString(int n) {
        
        //to keep track of index
        int left = 0;
        //to check prev element
        int right = 0;
        //to keep track of number of 1s
        int count = 0;

        //initiate string as "1"
        StringBuilder str = new StringBuilder("1");

        //keep on generating magical number until left pointer reaches index n-1 (iterate through n elements)
        while(left < n-1){
            if(str.charAt(left) == '1'){
                //generate 1 new element depending on previous element (right pointer)
                if(str.charAt(right) == '1'){
                    str.append("2");
                } else{
                    str.append("1");
                }
                //increment count, since left pointer is pointing to "1"
                count++;
                //increment both left and right pointer by 1
                left++;
                right++;
            } else{
                //generate two new elements based on previous element (right pointer)
                if(str.charAt(right) == '1'){
                    str.append("22");
                } else{
                    str.append("11");
                }
                //increment right by 2, left by 1
                right += 2;
                left++;
            }
        }

        //using Math.max because we've initiated count to be 0, but if n=1, left already equals to n-1 so count will not be updated, so a default 1 is being used
        //any n > 1 will have count > 1
        return Math.max(1,count);
    }
}
