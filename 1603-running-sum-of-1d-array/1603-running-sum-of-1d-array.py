class Solution(object):
    def runningSum(self, nums):
        a=[]
        sum1=0
        for i in range(len(nums)):
            for j in range(i+1):
                sum1+=nums[j]
            a.append(sum1)
            sum1=0
        return a    
        