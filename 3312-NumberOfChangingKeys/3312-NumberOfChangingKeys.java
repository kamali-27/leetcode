// Last updated: 8/14/2026, 3:58:04 PM
class Solution {
    public int countKeyChanges(String s) {
        int count=0;
        String str=s.toLowerCase();
        for(int i=0;i<str.length()-1;i++){
                if(str.charAt(i)!=str.charAt(i+1)){
                    count++;
                }
        }
        return count;
    }
}

//single loop - check the adjacent character
//nested loop - check the pair of character