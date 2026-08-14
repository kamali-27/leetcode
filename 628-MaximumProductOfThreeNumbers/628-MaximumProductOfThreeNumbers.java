// Last updated: 8/14/2026, 4:01:46 PM
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
         int product=nums[n-1]*nums[n-2]*nums[n-3]; //positive number split pana  use agu
        int product1=nums[0]*nums[1]*nums[n-1];
        return Math.max(product,product1);
    }
}


// -10,-10,1 2 3
// nums[n-1]*nums[n-2]*nums[n-3] =>1,2,3=>6
// nums[0]*nums[1]*nums[n-1]=>-10*-10*3=>300
// math.max(6,300)=>300


