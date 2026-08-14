# Last updated: 8/14/2026, 4:06:41 PM
class Solution:
    def longestPalindrome(self, s: str) -> str:
        result=""
        for i in range(len(s)):
            for j in range(i+1,len(s)+1):
                sub=s[i:j]
                if sub==sub[::-1]:
                    if len(sub)>len(result):
                        result=sub
        return result