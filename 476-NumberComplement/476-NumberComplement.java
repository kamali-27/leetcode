// Last updated: 8/14/2026, 4:02:10 PM
class Solution {
    public int findComplement(int num) {
         int n = ~0; 
        while ((num&n)!=0) {
            n<<=1; 
        }
        return ~num & ~n; 
    }
}