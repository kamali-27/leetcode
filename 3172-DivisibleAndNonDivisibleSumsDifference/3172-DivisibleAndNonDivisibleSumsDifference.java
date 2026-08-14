// Last updated: 8/14/2026, 3:58:15 PM
class Solution {
    public int differenceOfSums(int n, int m) {
        int sum=0;
        int sum1=0;
        for(int i=1;i<=n;i++){
            if(i%m!=0){
                sum+=i;
            }
            if(i%m==0){
                sum1+=i;
            }
        }
        int result=sum-sum1;
        return result;
    }
}