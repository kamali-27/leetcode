// Last updated: 8/14/2026, 4:01:19 PM
class Solution {
    public int search(int[] nums, int target) {
        boolean found=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                found=true;
                return i;
            }
        }
        return -1;
    }
}