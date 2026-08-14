// Last updated: 8/14/2026, 3:59:13 PM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(int i=0;i<operations.length;i++){
        if(operations[i].charAt(1)=='+'){
            x++;
        }else{
            x--;
        }
        }
        return x;
    }
}