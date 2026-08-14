// Last updated: 8/14/2026, 4:04:43 PM
class Solution {
    public String reverseWords(String s) {
        String rev="";
        String[] str=s.split(" ");
        for (int i = str.length - 1; i >= 0; i--) {
            if (!str[i].equals("")) {
                if(!rev.equals("")) {
                    rev+=" ";
                }
                rev+=str[i];
            }
        }
        return rev;
    }
}