// Last updated: 8/14/2026, 4:01:11 PM
class Solution {
    public String reverseOnlyLetters(String s) {
        String rev="";
        char[] t=s.toCharArray();
        int l=0;
        int r=t.length-1;
        while(l<r){
        if(!Character.isLetter(t[l])){
            l++;
        }else if(!Character.isLetter(t[r])){
            r--;
        }else{
            char temp=t[l];
            t[l]=t[r];
            t[r]=temp;
            l++;
            r--;
        }
        }
        return new String(t);
    }
}