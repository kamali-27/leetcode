// Last updated: 8/14/2026, 3:59:29 PM
class Solution {
    public boolean checkIfPangram(String sentence) {
        for(char ch='a';ch<='z';ch++){
            if(sentence.indexOf(ch)==-1){
                return false;
            }
        }
        return true;
    }
}