// Last updated: 8/14/2026, 4:04:36 PM
class Solution {
    public int findPeakElement(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                return i;
            }
        }
        return nums.length-1;
    }
}