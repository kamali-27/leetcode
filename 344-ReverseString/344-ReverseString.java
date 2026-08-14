// Last updated: 8/14/2026, 4:03:01 PM
class Solution {
    public void reverseString(char[] s) {
       int left=0;
       int right=s.length-1;
       while(left<right){
        char temp = s[left];
        s[left]=s[right];
        s[right]=temp;
        left++;
        right--;
       }
    }
}