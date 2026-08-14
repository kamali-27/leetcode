// Last updated: 8/14/2026, 4:05:47 PM
class Solution {
    public int mySqrt(int x) {
        int i=1;
        while(i<=x/i){
            i++;
        }
        return i-1;
    }
}

// i	x/i	
// 1	8	1 <= 8 
// 2	4	2 <= 4 
// 3	2	3 <= 2

// 3-1=2