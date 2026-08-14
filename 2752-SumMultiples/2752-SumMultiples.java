// Last updated: 8/14/2026, 3:58:20 PM
class Solution {
    public int sumOfMultiples(int n) {
        int sum=0,i=2;
        while(i<=n){
            if(i%3==0||i%5==0||i%7==0){
                sum=sum+i;
            }i++;
        }
        return sum;
    }
}