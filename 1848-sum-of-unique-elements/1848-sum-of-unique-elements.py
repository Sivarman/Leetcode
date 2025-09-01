class Solution(object):
    def sumOfUnique(self, nums):
        a=[i for i in nums if nums.count(i)==1]
        return sum(a)
    