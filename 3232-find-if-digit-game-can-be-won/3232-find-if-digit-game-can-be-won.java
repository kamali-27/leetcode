class Solution {
    public boolean canAliceWin(int[] nums) {
        int snum=0;
        int dsum=0;
        for(int num:nums){
            if(num<10){
                snum+=num;
            }else{
                dsum+=num;
            }
        }
        return snum!=dsum;
    }
}