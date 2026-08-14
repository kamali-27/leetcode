// Last updated: 8/14/2026, 3:58:23 PM
class Solution {
    public int findDelayedArrivalTime(int n1,int n2) {
        int c=n1+n2;
        return c%24;
    }
}