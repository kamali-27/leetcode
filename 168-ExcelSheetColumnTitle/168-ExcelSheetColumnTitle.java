// Last updated: 8/14/2026, 4:04:30 PM
class Solution {
    public String convertToTitle(int columnNumber) {
        String result="";
        while(columnNumber>0){
            columnNumber--;
            result=(char)('A'+(columnNumber%26))+result;
            columnNumber/=26;
        }
        return result;
    }
}