class Solution(object):
    def minimumSum(self, nums):
        b=[]
        for i in range(len(nums)-2):
            for j in range(i+1,len(nums)-1):
                for k in range(j+1,len(nums)):
                    if((i<j<k) and ((nums[i]<nums[j]) and(nums[k]<nums[j]))):
                        b.append(nums[i]+nums[j]+nums[k])
        if(len(b)>0):
            return min(b)
        else:
            return -1    

        