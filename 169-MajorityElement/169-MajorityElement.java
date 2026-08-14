// Last updated: 8/14/2026, 4:04:27 PM
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        for(int i = 0; i < nums.length; i++) {
            if(count == 0) {
                candidate = nums[i];
            }
            if(nums[i] == candidate) {
                count++;
            }
            else {
                count--;
            }
        }
        return candidate;
    }
}
