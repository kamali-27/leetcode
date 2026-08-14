# Last updated: 8/14/2026, 4:02:07 PM
class Solution:
    def licenseKeyFormatting(self, s: str, k: int) -> str:
        t=""
        for ch in s:
            if ch!="-":
                t+=ch.upper()
        res=""
        count=0
        for i in range(len(t)-1,-1,-1):
            res=res+t[i]
            count+=1
            if count==k and i!=0:
                res+="-"
                count=0
        return res[::-1]
        