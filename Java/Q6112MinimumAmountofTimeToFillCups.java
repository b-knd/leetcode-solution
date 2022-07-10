/*
b-knd (jingru) on 10 July 2022 11:41:00
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Q6112MinimumAmountofTimeToFillCups {
  
    /*
    Concept:
    - Convert array to list
    - Keep sorting list in reverse order and deduct the first or first two (if greater than 0) and increment count
    - Stop iteration if all element equals 0 and return count
    e.g. fillCups(new int[] {1, 4, 2})
    [1, 4, 2] count = 0
    In first while loop (decrementing first two element):
    [4, 2, 1] -> [3, 1, 1] count = 1
    [3, 1, 1] -> [2, 0, 1] count = 2
    [2, 1, 0] -> [1, 0, 0] count = 3
    In second while loop (decrementing only first element):
    [1, 0, 0] -> [0, 0, 0] count = 4
    */
    public int fillCups(int[] amount) {
        int count = 0;
        List<Integer> list = Arrays.stream(amount).boxed().collect(Collectors.toList());
        Collections.sort(list);
        Collections.reverse(list);
        while(list.get(0) > 0 && list.get(1) > 0){
            list.set(0, list.get(0)-1);
            list.set(1, list.get(1)-1);
            count++;
            Collections.sort(list);
            Collections.reverse(list);
        }
        while(list.get(0) > 0){
            list.set(0, list.get(0)-1);
            count++;
            Collections.sort(list);
            Collections.reverse(list);
        }
        return count;
    }
}
