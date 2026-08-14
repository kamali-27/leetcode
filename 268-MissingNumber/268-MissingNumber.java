// Last updated: 8/14/2026, 4:03:38 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum1=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum1-sum;
    }
}

// nums.length n=3;
// 3*(3+1)/2=>3*(4)/2=>12/2=>6
// 0+1+2+3=6(0 to 3)answer
// 3+0+1=4
// sum1-sum=6-4=2