/*
@b-knd (jingru) on 27 July 2022 08:27:00
*/

import java.util.*;
import java.math.*;

class Q1672RichestCustomer {
    public int maximumWealth(int[][] accounts) {
        //construct two loop, one for accounts and an inner one to loop through value in each account and update max with a greater value after comparing
        int max = 0;
        for(int[] account: accounts){
            int wealth = 0;
            for(int val: account){
                wealth += val;
            }
            max = Math.max(max, wealth);
        }
        return max;
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Richest Customer Wealth.
//Memory Usage: 42 MB, less than 85.80% of Java online submissions for Richest Customer Wealth.
