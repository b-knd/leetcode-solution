/*
@b-knd (jingru) on 01 August 2022 15:15:00
*/

class BrowserHistory {
    List<String> tabs;
    //use curr to keep track of current tab index
    int curr;
  
    public BrowserHistory(String homepage) {
        tabs = new ArrayList<>(List.of(homepage));
        curr = 0;
    }
    
    //remove all tabs after current tab, add new url and update curr
    public void visit(String url) {
        tabs.subList(curr+1, tabs.size()).clear();
        tabs.add(url);
        curr = tabs.size()-1;    
    }
    
    //use Math.max to set curr to default 0 if steps taken go beyond beginning of tabs
    public String back(int steps) {
        curr = Math.max(0, curr-steps);
        return tabs.get(curr);
    }
    
    //use Math.min to set curr to default of last index if steps taken go beyond the entire list
    public String forward(int steps) {
        curr = Math.min(tabs.size()-1, curr+steps);
        return tabs.get(curr);
    }
}

//Runtime: 83 ms, faster than 77.35% of Java online submissions for Design Browser History.
//Memory Usage: 82.2 MB, less than 65.47% of Java online submissions for Design Browser History.


/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
