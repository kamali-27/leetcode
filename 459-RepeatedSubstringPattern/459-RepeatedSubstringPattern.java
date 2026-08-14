// Last updated: 8/14/2026, 4:02:17 PM
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        boolean found=false;
    for (int i=1;i<=s.length()/2;i++) {
            if (s.length() % i==0) {
                String sub =s.substring(0, i);
                String temp="";
                for (int j=0;j<s.length()/i;j++) {
                    temp=temp+sub;
                }
                if (temp.equals(s)) {
                    found=true;
                    break;
                }
            }
        }
    return found;
    }
}