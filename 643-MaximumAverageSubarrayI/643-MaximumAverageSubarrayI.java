// Last updated: 8/14/2026, 4:01:43 PM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int max=sum;
        int sum1=0;
        for(int i=k;i<nums.length;i++){
            sum=sum+nums[i]-nums[i-k];
            max=Math.max(max,sum);
        }
        return (double)max/k;
    }
}