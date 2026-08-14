// Last updated: 8/14/2026, 4:04:49 PM
class Solution {
    public int singleNumber(int[] nums) {
    int res=0;;
    for( int i=0;i<nums.length;i++){
        res=res^nums[i];
    }
        return res;
    }
}
