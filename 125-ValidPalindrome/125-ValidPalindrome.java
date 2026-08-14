// Last updated: 8/14/2026, 4:04:56 PM
class Solution {
    public boolean isPalindrome(String s) {
         String str=s.toLowerCase().replaceAll("[^a-z0-9]","");
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(rev.equals(str)){
           return true;
        }
            return false;
    }
}