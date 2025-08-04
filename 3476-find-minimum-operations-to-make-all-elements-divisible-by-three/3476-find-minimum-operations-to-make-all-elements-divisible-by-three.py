class Solution(object):
    def minimumOperations(self, nums):
        a=[i for i in nums if(i%3!=0)]
        return len(a)

        