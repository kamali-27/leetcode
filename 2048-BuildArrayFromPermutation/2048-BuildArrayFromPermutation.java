// Last updated: 8/14/2026, 3:59:24 PM
class Solution {
    public int[] buildArray(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
}