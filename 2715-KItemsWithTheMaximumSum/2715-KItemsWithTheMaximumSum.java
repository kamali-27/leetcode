// Last updated: 8/14/2026, 3:58:31 PM
class Solution {
    int min(int a,int b){
        return a<b?a:b;
    }
    int max(int a,int b){
        return a>b?a:b;
    }
    public int kItemsWithMaximumSum(int no,int nz,int nn, int k) {
        int ans=min(k,no)-max(0,k-nz-no);
        return ans;
    }
}