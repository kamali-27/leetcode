// Last updated: 8/14/2026, 3:58:41 PM
class Solution {
    public int commonFactors(int a, int b) {
        int n=Math.min(a,b);
        int i=1;
        int count=0;
        while(i<=n){
            if(a%i==0&& b%i==0){
                count++;
            }i++;
        }
        return count;
    }
}