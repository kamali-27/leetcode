// Last updated: 8/14/2026, 4:01:35 PM
class Solution {
    public boolean hasAlternatingBits(int n) {
        int a=n^(n>>1);
        return (a&(a+1))==0;
    }
}