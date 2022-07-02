/*
Description:
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. 
The digits are ordered from most significant to least significant in left-to-right order. 
The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.
Example:
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
*/

var plusOne = function(digits) {
    return plusOneRecurse(digits, digits.length -1);
}
var plusOneRecurse = function(digits, index) {
    if(digits[index] < 9) {
        digits[index] = digits[index] + 1;
        return digits;
    } else {
        if(index == 0) {
            let newArray = [1];
            digits[index] = 0;
            return newArray.concat(digits);
        } else{
            digits[index] = 0;
            return plusOneRecurse(digits, index - 1);
        }
    }    
};


//Runtime: 62 ms, faster than 92.96% of JavaScript online submissions for Plus One.
//Memory Usage: 42.4 MB, less than 15.53% of JavaScript online submissions for Plus One.
