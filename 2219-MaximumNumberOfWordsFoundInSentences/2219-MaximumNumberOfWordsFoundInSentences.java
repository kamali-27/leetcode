// Last updated: 8/14/2026, 3:59:08 PM
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0;i<sentences.length;i++){
            int count=sentences[i].split(" ").length;
        if(count>max){
            max=count;
        }
        }
        return max;
    }
}
// sentences[0]
//sentences[0].split(" ")
//[alice,and,bob,love,leetcode]
//sentences[0].split(" ").length =>5
//(5>0)  => 0=5=>max=5 will upadtes