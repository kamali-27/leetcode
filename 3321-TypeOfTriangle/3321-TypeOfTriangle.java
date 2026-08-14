// Last updated: 8/14/2026, 3:58:02 PM
class Solution {
    public String triangleType(int[] nums) {
        int a=nums[0];
        int b=nums[1];
        int c=nums[2];
        if(a+b<=c||a+c<=b||b+c<=a){
            return "none";
        }
        if(a==b&&b==c){
            return "equilateral";
        }else if(a==b||b==c||a==c){
            return "isosceles";
        }else {
            return "scalene";
        }
        
    }
}


// equilateral => triangle has all sides are equal
// isosceles => triangle has 2 sides are same but one side is different
// scalene => all sides are different