// Last updated: 8/14/2026, 4:05:40 PM
class Solution {
    public boolean search(int[] nums, int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
             return true;
            }
        }
        return false;
    }
}