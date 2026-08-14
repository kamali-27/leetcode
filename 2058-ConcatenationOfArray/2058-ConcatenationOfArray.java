// Last updated: 8/14/2026, 3:59:19 PM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int ans[]=new int[2*n];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;
    }
}