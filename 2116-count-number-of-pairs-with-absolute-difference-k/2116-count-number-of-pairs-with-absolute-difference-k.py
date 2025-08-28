class Solution(object):
    def countKDifference(self, nums, k):
        a=0
        for i in range(len(nums)-1):
            for j in range(i+1,len(nums)):
                if(i<j):
                    if(abs(nums[i]-nums[j])==k):
                        a+=1
        return a

        