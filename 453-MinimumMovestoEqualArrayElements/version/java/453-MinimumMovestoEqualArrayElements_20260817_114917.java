// Last updated: 8/17/2026, 11:49:17 AM
1class Solution {
2    public int minMoves(int[] nums) {
3        int min=nums[0];
4        for(int num:nums){
5            min=Math.min(min,num);
6        }
7        int moves=0;
8        for(int num:nums){
9            moves+=(num-min);
10        }
11        return moves;
12    }
13}