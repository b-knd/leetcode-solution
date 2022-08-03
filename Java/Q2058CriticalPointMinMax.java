/*
@b-knd (jingru) on 03 August 2022 09:25:00
*/

class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] res = new int[] {-1, -1};
      
        //if the linked list has less than three node, there will be no critical point and return -1
        if(head == null || head.next == null || head.next.next == null){
            return res;
        }
       
        int minIndex = Integer.MAX_VALUE, currIndex = -1, lastIndex = -1;
        ListNode prev = head, curr = head.next;
        int minD = Integer.MAX_VALUE, index = 1;
        while(curr != null && curr.next != null){
            /*
            If critical point found
            - minIndex is the smallest index for critical point
            - lastIndex is being updated and currentIndex is set to index of the critical point node (newly found critical point)
            - if lastIndex exists (2 or more critical points found), update minimum distance if applicable
            */
            if((curr.val < prev.val && curr.val < curr.next.val) || (curr.val > prev.val && curr.val > curr.next.val)){
                minIndex = Math.min(minIndex, index);
                lastIndex = currIndex;
                currIndex = index;
                if(lastIndex != -1 && currIndex - lastIndex < minD){
                    minD = currIndex - lastIndex;
                }
            }
            //moving forward with rest of the nodes, increment index (keep track)
            prev = curr;
            curr = curr.next;
            index++;
        }
        //less than 2 critical point found
        if(lastIndex == -1){
            return res;
        } else{
            res[0] = minD;
            res[1] = currIndex-minIndex;
        }
        return res;
    }
}

//Runtime: 6 ms, faster than 91.63% of Java online submissions for Find the Minimum and Maximum Number of Nodes Between Critical Points.
//Memory Usage: 100.7 MB, less than 69.30% of Java online submissions for Find the Minimum and Maximum Number of Nodes Between Critical Points.
