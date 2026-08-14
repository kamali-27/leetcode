// Last updated: 8/14/2026, 4:03:06 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==0) return false;
        while(n%4==0)
            n=n/4;
            return n==1;
    }
}