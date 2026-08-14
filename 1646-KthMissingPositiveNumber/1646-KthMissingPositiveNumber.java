// Last updated: 8/14/2026, 4:00:10 PM
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int num=1;
        int i=0;
        while(k>0){
            if(i<arr.length&&arr[i]==num){
                i++;
            }else{
                k--;
                if(k==0){
                    return num;
                }
            }
            num++;
        }
        return num;
    }
}