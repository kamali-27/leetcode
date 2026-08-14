// Last updated: 8/14/2026, 4:00:24 PM
class Solution {
    public int countOdds(int low, int high) {
        if(low%2==1||high%2==1){
            return (high - low)/2+1;
        }else{
        return (high - low) / 2;
        }
    }
}