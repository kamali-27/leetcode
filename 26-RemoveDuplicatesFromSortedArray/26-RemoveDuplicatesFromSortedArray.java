// Last updated: 8/14/2026, 4:06:21 PM
public class Solution {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int k = 1; 
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i]; 
                k++;
            }
        }
        return k; 
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int k1 = removeDuplicates(nums1);
        System.out.print("Output: " + k1 + ", nums = ");
        for (int i = 0; i < k1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();
        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
        int k2 = removeDuplicates(nums2);
        System.out.print("Output: " + k2 + ", nums = ");
        for (int i = 0; i < k2; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();
    }
}
