// Last updated: 8/14/2026, 3:59:53 PM
class Solution {
    public int numberOfMatches(int n) {
        if(n%2==0)
        return (n+n-1)/2;
        else
        return (n-1);
    }
}