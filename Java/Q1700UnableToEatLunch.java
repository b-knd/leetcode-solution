/*
@b-knd (jingru) on 05 August 2022 09:37:00
*/

//order of students does not matter (since they can always go to back of the queue until matching student and sandwich is found (but order of sandwixh matters)
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] count = new int[] {0, 0};
        for(int i: students){
            count[i]++;
        }
        int k, n = students.length;
        
        //stop at sandwich[k] where there are no more student wanting that sandwich and the rest do not get to eat
        for(k = 0; k < n && count[sandwiches[k]] > 0; k++){
            count[sandwiches[k]]--;
        }
        return n-k;
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of Students Unable to Eat Lunch.
//Memory Usage: 41.5 MB, less than 79.25% of Java online submissions for Number of Students Unable to Eat Lunch.
