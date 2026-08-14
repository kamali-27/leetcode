// Last updated: 8/14/2026, 4:00:53 PM
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                count++;
                if(count==3){
                    return true;
                }
             }else{
                count=0;
             }
        }
        return false;
    }
}

// 