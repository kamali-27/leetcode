// Last updated: 8/14/2026, 4:01:58 PM
class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.equals(word.toUpperCase())
        || word.equals(word.toLowerCase())
        ||word.equals(word.substring(0,1).toUpperCase()
        +word.substring(1).toLowerCase()))
        {
            return true;
        }
        return false;
    }
}