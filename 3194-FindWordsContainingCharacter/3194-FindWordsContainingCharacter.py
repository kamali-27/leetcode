# Last updated: 8/14/2026, 3:58:07 PM
class Solution(object):
    def findWordsContaining(self, words, x):
        res=[]
        for i in range(len(words)):
            if x in words[i]:
                res.append(i)
        return res