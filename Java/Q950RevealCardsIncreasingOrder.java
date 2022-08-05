/*
@b-knd (jingru) on 05 August 2022 10:35:00
*/

/*
- fill 0, move 1 to back, fill 2, move 3 to back, ... untill all indices have been filled up
*/

class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length; 
        Queue<Integer> index = new LinkedList();
        for(int i = 0; i < n; i++){
            index.add(i);
        }
        int[] ans = new int[n];
        Arrays.sort(deck);
        for(int card: deck){
            ans[index.poll()] = card;
            if(!index.isEmpty()){
                index.add(index.poll());
            }
        }
        return ans;
    }
}

//Runtime: 3 ms, faster than 97.47% of Java online submissions for Reveal Cards In Increasing Order.
//Memory Usage: 42.3 MB, less than 93.04% of Java online submissions for Reveal Cards In Increasing Order.
