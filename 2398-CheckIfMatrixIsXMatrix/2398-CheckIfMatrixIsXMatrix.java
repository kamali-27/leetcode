// Last updated: 8/14/2026, 3:58:50 PM
class Solution {
    public boolean checkXMatrix(int[][] grid) {
       int n=grid.length;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<n;j++){
            if(i==j||i+j==n-1){
                if(grid[i][j]==0){
                    return false;
                }
            }
                else{
                 if(grid[i][j]!=0){ 
                    return false;
                }
            }
        }
    }
    return true;
    }
}
// first if check diagonal is zero
// second else kulla if check diagonal is non zero
