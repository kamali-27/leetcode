// Last updated: 8/14/2026, 4:00:46 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int dig=0;
        int sum=0;
        int product=1;
        while(n>0){
            dig=n%10;
            sum+=dig;
            product*=dig;
            n/=10;
        }
        int result = product - sum;
        return result;
    }
}