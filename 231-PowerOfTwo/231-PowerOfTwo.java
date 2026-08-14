// Last updated: 8/14/2026, 4:03:57 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0)  return false;
        while(n%2==0)
           n=n/2;       
        return n==1;
    }
}