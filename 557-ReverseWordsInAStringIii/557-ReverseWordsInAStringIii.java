// Last updated: 8/14/2026, 4:01:54 PM
class Solution {
    public String reverseWords(String s) {
        String rev="";
        String[] words=s.split(" ");
        for(String word:words){
            for(int i=word.length()-1;i>=0;i--){
                rev+=word.charAt(i);
            }
            rev+=" ";
        }
        return rev.trim();
    }
}






