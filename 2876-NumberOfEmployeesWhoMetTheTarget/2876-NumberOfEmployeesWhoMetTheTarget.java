// Last updated: 8/14/2026, 3:58:17 PM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        for(int i=0;i<hours.length;i++){
            int n=hours[i];
            if(n>=target){
                count++;
            }
        }
        return count;
    }
}