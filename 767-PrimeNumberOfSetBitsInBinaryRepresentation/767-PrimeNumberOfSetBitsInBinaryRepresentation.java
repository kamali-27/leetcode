// Last updated: 8/14/2026, 4:01:27 PM
class Solution {
    int setBitcount(int n){
        int count=0;
        while(n!=0){
            count=count+(n&1);
            n=n>>1;
        }
        return count;
    }
    public int countPrimeSetBits(int left, int right) {
        int a;
        int count=0;
        while(left<=right){
            a=setBitcount(left);
            if(a==2||a==3||a==5||a==7||a==11||a==13||a==17||a==19||a==23||a==29||a==31){
                count++;
            }
            left++;
        }
        return count;
    
    }
}