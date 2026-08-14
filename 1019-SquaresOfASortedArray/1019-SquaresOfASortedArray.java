// Last updated: 8/14/2026, 4:01:06 PM
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int [] res=new int[n];
        int l=0;
        int r=n-1;
        int index=n-1;
        while(l<=r){
            int lsqrt=nums[l]*nums[l];
            int rsqrt=nums[r]*nums[r];
            if(lsqrt>rsqrt){
                res[index--]=lsqrt;
                l++;
            }
            else{
                res[index--]=rsqrt;
                r--;
            }
        }
        return res;
    }
}