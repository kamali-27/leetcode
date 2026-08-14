// Last updated: 8/14/2026, 3:58:34 PM
class Solution {
    public int countDigits(int num) {
        int temp=num;
        int count=0;
        while(num>0){
            int dig=num%10;
            if(temp%dig==0){
                count++;
            }
            num/=10;
        }
        return count;
    }
}