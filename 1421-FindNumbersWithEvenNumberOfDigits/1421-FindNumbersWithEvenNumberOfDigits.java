// Last updated: 8/14/2026, 4:00:45 PM
class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
       
        for(int i=0;i<nums.length;i++){
            int digit=0;
            int n=nums[i];
            while(n>0){
                digit++;
                n/=10;
            }
            if(digit%2==0){
                count++;
            }
        }
        return count;
    }
}
