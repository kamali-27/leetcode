// Last updated: 9/21/2026, 2:15:08 PM
1class Solution {
2    public boolean checkPerfectNumber(int num) {
3        int sum=0;
4        for(int i=1;i<num;i++){
5            if(num % i==0){
6                sum+=i;
7            }
8        }
9        if(sum==num){
10            return true;
11        }else{
12            return false;
13        }
14    }
15}