// Last updated: 8/14/2026, 4:02:36 PM
class Solution {
    public char findTheDifference(String s, String t) {
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            int count=0;
            int count1=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==ch){
                    count++;
                }
            }
            for(int j=0;j<t.length();j++){
                if(t.charAt(j)==ch){
                    count1++;
                }
            }
            if(count!=count1){
                return ch;
            }
        }
        return ' ';
    }
}