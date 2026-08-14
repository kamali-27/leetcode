// Last updated: 8/14/2026, 4:05:44 PM
class Solution {
    public int climbStairs(int n) {
        int a=1;int b=2;
         if(n<=2){
            return n;
         }for(int i=3;i<=n;i++){
            int c=a+b;
            a=b;
            b=c;
         }
         return b;
    }
}












// 1   1                                           1
// 2   1,2                                         2
// 3   111,21,12                                   3
// 4   1111,22,112,211,121                         5
// 5   11111,221,1112,1121,212,1211,122,2111       8