// Last updated: 8/14/2026, 4:06:38 PM
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int original  = x;
        int reversed = 0;
        while(x>0){
            reversed = reversed * 10 + x% 10;
            x=x/10;
        }
        return original== reversed;
    }
}