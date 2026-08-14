// Last updated: 8/14/2026, 4:04:34 PM
class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        for(int i=1;i<nums.length;i++){
                int element=nums[i]-nums[i-1];
         if(element > max){
            max=element ;
         
         }
     }
     return max;
    }
}