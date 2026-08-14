// Last updated: 8/14/2026, 4:04:10 PM
class Solution {
    public boolean isHappy(int n) {
        while(n>9){
        int sum=0;
        while(n>0){
            int dig=n%10;
            sum+=dig*dig;
            n/=10;
        }
        n=sum;
        }
        return (n==1||n==7);
    }
}