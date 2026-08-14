// Last updated: 8/14/2026, 4:00:08 PM
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            max=Math.max(max,sum);
        }
        return max;
    }
}