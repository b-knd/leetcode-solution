/*
@b-knd (jingru) on 28 July 2022 08:59:00
*/

class Q12IntegerToRoman {
    int[] value = new int[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] roman = new String[] {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    
    public String intToRoman(int num) {
        StringBuilder str = new StringBuilder();
    
        for(int i = 0; i < value.length; i++){
            while(num >= value[i]) {
                str.append(roman[i]);
                num -= value[i];
            }
        }   
        return String.valueOf(str);
    }
}

//Runtime: 7 ms, faster than 82.93% of Java online submissions for Integer to Roman.
//Memory Usage: 45.8 MB, less than 51.32% of Java online submissions for Integer to Roman.
