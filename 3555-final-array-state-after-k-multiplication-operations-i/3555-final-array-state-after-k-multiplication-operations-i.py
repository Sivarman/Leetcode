class Solution(object):
    def getFinalState(self, nums, k, multiplier):
        for i in range(k):
            a= min(nums)
            b=nums.index(a)
            nums[b] = nums[b]*multiplier
        return  nums
            

        