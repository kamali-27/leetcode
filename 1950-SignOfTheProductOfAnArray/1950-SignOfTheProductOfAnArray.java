// Last updated: 8/14/2026, 3:59:49 PM
class Solution {
    public int arraySign(int[] nums) {
        int negcount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                return 0;
            }
            if(nums[i]<0){
                negcount++;
            }
        }
            if(negcount%2==0){
                return 1;
            }
        return -1;
    }
}