// Last updated: 8/14/2026, 3:59:05 PM
class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            String word=words[i];
            String rev="";
            for(int j=word.length()-1;j>=0;j--){
                rev+=word.charAt(j);
            }
        if(word.equals(rev)){
            return word;
        }
        }
        return "";
    }
}