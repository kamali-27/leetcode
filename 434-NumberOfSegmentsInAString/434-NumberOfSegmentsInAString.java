// Last updated: 8/14/2026, 4:02:19 PM
class Solution {
    public int countSegments(String s) {
        int count=0;
        String[] str=s.split(" ");
        for(String str1:str){
            if(!str1.equals("")){
            count++;
        }
        }
       
        return count;
    }
}


// edha condition  if(!str1.equals(""))
// !"hello".equals("")=>!false 
// count++ agu
// !"".equals("")=>!true
// condition true =>so count agadhu