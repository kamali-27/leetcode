// Last updated: 8/14/2026, 4:00:36 PM
class Solution {
    public int removePalindromeSub(String s) {
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
            if(s.equals(rev)){
                return 1;
            }
        }
        return 2;
    }
}