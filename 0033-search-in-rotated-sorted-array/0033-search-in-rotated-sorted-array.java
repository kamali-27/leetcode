class Solution {
    public int search(int[] nums, int target) {
        int sum=0;
        boolean found=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                found=true;
                return i;
                // sum=nums[target];
            }
        //     if(!found){
        //     sum=-1;
        // }
        }
        return -1;
    }
}