/*
@b-knd (jingru) on 18 July 2022 09:29:00
Referred to solution by arignote (https://leetcode.cn/u/arignote/)
*/

/*
Concept:
- Loop through queries, create an array of indexes
- Sort the array by comparing substring (after trimming strings to last kth index)
- Access first ith index from the sorted array and add to result array
*/

import java.util.Arrays;

public class Q6121QueryKthSmallestTrimeedNumber {
    
    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        int[] result = new int[queries.length];
        for(int i = 0; i < queries.length; i++){
            Integer[] index = new Integer[nums.length];
            for(int j = 0; j < nums.length; j++){
                index[j] = j;
            }
            int k = nums[0].length() - queries[i][1];
            Arrays.sort(index, (x, y) -> nums[x].substring(k).compareTo(nums[y].substring(k)));
            result[i] = index[queries[i][0]-1];
        }
        return result;
    }
}
