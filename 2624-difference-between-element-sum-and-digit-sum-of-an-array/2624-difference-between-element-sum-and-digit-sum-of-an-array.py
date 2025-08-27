class Solution(object):
    def differenceOfSum(self, nums):
        sum1=0
        ns=sum(nums)
        for i in nums:
            while i>0:
                r= i%10
                sum1+=r
                i=i/10
        return abs(sum1-ns)    
