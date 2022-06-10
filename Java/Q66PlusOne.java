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

public class Q66PlusOne {
    public int[] plusOne(int[] digits) {
        return plusOneRecurse(digits, digits.length-1);
    }

    public int[] plusOneRecurse(int[] digits, int index) {
        if(digits[index] < 9){
            digits[index] = digits[index] + 1;
            return digits;
        } else{
            if(index == 0){
                int[] newArray = new int[digits.length + 1];
                newArray[0] = 1;
                digits[index] = 0;
                System.arraycopy(digits, 0, newArray, 1, digits.length);
                return newArray;
            } else{
                digits[index] = 0;
                return plusOneRecurse(digits, index-1);
            }
        }
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Plus One.
//Memory Usage: 40.8 MB, less than 82.17% of Java online submissions for Plus One.
