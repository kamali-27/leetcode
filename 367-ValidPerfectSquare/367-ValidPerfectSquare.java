// Last updated: 8/14/2026, 4:02:46 PM
class Solution {
    public boolean isPerfectSquare(int num) {
       for(long i=0;i*i<=num;i++){
        if(i*i==num){
            return true;
        }
       }
        return false;
    }
}