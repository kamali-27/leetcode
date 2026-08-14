// Last updated: 8/14/2026, 4:04:22 PM
class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        int fact = 5;
        while (n >= fact) {
            count =count + n / fact;
            fact =fact * 5;
        }
        return count;
    }
 }