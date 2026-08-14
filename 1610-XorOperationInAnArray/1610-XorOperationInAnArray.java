// Last updated: 8/14/2026, 4:00:28 PM
class Solution {
    public int xorOperation(int n, int start) {
        int nums=0;
        for(int i=0;i<n;i++)
        nums=nums^(start+2*i);
        return nums;
    }
}
// i  (start + 2*i)	     nums
// 0	0	         0
// 1	2	         0 ^ 2 = 2
// 2	4	         2 ^ 4 = 6
// 3	6	         6 ^ 6 = 0
// 4	8	         0 ^ 8 = 8


// rules
// A	B	A ^ B
// 0	0	0
// 0	1	1
// 1	0	1
// 1	1	0



// 0     3    