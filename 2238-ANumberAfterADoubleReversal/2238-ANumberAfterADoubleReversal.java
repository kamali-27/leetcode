// Last updated: 8/14/2026, 3:59:00 PM
class Solution {
    public boolean isSameAfterReversals(int n) {
       if(n==0)
       return true;
       return!(n%10==0);
    }
}