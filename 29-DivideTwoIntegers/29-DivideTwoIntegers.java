// Last updated: 8/14/2026, 4:06:09 PM
class Solution {
    public int divide(int dividend, int divisor) {
         if (dividend==Integer.MIN_VALUE && divisor== -1) {
            return Integer.MAX_VALUE;
        }
        return dividend/divisor;
    }
}

// if (10 == -2147483648 && 3 == -1)
// 10 == -2147483648  false
// 3 == -1  false 
// result also return false
