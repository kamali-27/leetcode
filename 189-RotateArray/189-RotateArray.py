# Last updated: 8/14/2026, 4:04:18 PM
class Solution:
    def rotate(self, nums, k):
        for i in range(k):
            x = nums.pop()
            nums.insert(0, x)