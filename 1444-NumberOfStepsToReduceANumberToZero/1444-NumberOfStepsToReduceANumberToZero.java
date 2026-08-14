// Last updated: 8/14/2026, 4:00:42 PM
class Solution {
    public int numberOfSteps(int n) {
        int steps=0;
        while(n>0){
        if(n%2==0){
            steps++;
            n= n/2;
        }else {
            steps++;
            n= n-1;
        }
        }
       return steps;
    }
}