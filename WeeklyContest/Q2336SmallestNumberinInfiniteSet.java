/*
b-knd (jingru) on 10 July 2022 11:48:00
*/

import java.util.ArrayList;

/*
Question:
You have a set which contains all positive integers [1, 2, 3, 4, 5, ...].

Implement the SmallestInfiniteSet class:

SmallestInfiniteSet() Initializes the SmallestInfiniteSet object to contain all positive integers.
int popSmallest() Removes and returns the smallest integer contained in the infinite set.
void addBack(int num) Adds a positive integer num back into the infinite set, if it is not already in the infinite set.
*/

public class Q2336SmallestNumberinInfiniteSet {
    static class SmallestInfiniteSet {
        //keep track of the current smallest element
        int smallest = 1;
        
        //keep track of element that have been removed
        ArrayList<Integer> removed;

        
        //initiate a new empty arraylist (with no element removed yet)
        public SmallestInfiniteSet() {
            removed = new ArrayList<>();
        }
        
        //remove 'smallest' and find the next smallest element (that has not been removed)
        public int popSmallest() {
            int pop = smallest;
            removed.add(smallest);
            while(removed.contains(smallest)){
                smallest++;
            }
            return pop;
        }

        //if the element has not been removed, replaced 'smallest' with num if num smaller than 'smallest', and removes num from list of removed elements
        public void addBack(int num) {
            if(removed.contains(num)){
                smallest = Math.min(smallest, num);
                removed.remove(new Integer(num));
            }
        }
    }
}
