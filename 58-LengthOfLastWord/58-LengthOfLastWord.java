// Last updated: 8/14/2026, 4:05:55 PM
class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
        if(s.charAt(i)!=' '){
            count++;
        }else if(count>0){
            break;
        }
        }
        return count;
    }
}