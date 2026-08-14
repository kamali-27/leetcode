// Last updated: 8/14/2026, 4:00:49 PM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        int[] count=new int[arr.length];
        int k=0;
        int c=1;
        for(int i=1;i<arr.length;i++){
                if(arr[i]==arr[i-1]){
                    c++;
                }else{
                    count[k]=c;
                    k++;
                    c=1;
                }
        }
        count[k]=c;
        for(int i=0;i<=k;i++){
            for(int j=i+1;j<=k;j++){
                if(count[i]==count[j]){
                    return false;
                }
            }
        }
        return true;
    }
}