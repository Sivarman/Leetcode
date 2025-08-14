class Solution(object):
    def countPairs(self, nums, target):
        a=0
        for i in range(len(nums)-1):
            for j in range(i+1,len(nums)):
                # if(i<len(nums) and j<len(nums)):
                if(nums[i]+nums[j]<target):
                    a+=1
        return a

        