// Last updated: 8/14/2026, 4:04:13 PM
class Solution {
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            count= count+(n&1);
            n>>>=1;
        }
        return count;
    }
}