// Last updated: 8/14/2026, 3:58:01 PM
class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int temp;
        for(int i=0;i<nums.length;i+=2){
             temp=nums[i];
            nums[i]=nums[i+1];
            nums[i+1]=temp;
        }
        return nums;
    }
}


//[2,3,4,5]
// i=0 => i+=2(nums[1])     (0,1)
// temp= num[i]=>temp= 2
// nums[i]=nums[i+1]=>nums[0]=nums[1]=>2=3 [3,3,4,5]
// nums[i+1]=temp=>nums[1]=2 =>[3,2,4,5]


// i=2 =>i+=2 nums[3]
// temp=nums[i]=> nums[2]=>temp=4
// nums[i]=nums[i+1]=>nums[2]=nums[3]=>4=5 [3,2,5,5]
// nums[i]=temp=>temp =4 [3,2,5,4]