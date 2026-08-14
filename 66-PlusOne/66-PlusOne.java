// Last updated: 8/14/2026, 4:05:52 PM
public class Solution {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;      
                return digits;
            }
            digits[i] = 0;         
        }
        int[] ans = new int[n + 1];
        ans[0] = 1; 
        return ans;
    }
    }
