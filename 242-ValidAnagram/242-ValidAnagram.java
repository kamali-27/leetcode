// Last updated: 8/14/2026, 4:03:50 PM
class Solution {
    public boolean isAnagram(String s, String t) {
    if(s.length()!=t.length())
         return false;
    char[] a=s.toCharArray();
    char[] b=t.toCharArray();
    Arrays.sort(a);
    Arrays.sort(b);
    return (Arrays.equals(a,b));
    }
}