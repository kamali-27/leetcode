// Last updated: 8/24/2026, 3:54:39 PM
1class Solution {
2    public boolean judgeCircle(String moves) {
3        int x=0;
4        int y=0;
5        for(int i=0;i<moves.length();i++){
6            char ch=moves.charAt(i);
7            if(ch=='R'){
8                x++;
9            }else if(ch=='L'){
10                x--;
11            }else if(ch=='U'){
12                y++;
13            }else if(ch=='D'){
14                y--;
15            }
16        }
17        return x==0 && y==0;
18    }
19}