/*
@b-knd (jingru) on 04 August 2022 09:21:00
*/

class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        
        //for every new indexes, check to see if there is any previous elements larger than/equal to current element
        //if exist, pop from stack and apply discount
        for(int i = 0; i < prices.length; i++){
            while(!stack.empty() && prices[stack.peek()] >= prices[i]){
                prices[stack.pop()] -= prices[i];
            }
            stack.push(i);
        }
        return prices;
    }
}

//Runtime: 4 ms, faster than 48.96% of Java online submissions for Final Prices With a Special Discount in a Shop.
//Memory Usage: 44.4 MB, less than 39.73% of Java online submissions for Final Prices With a Special Discount in a Shop.
