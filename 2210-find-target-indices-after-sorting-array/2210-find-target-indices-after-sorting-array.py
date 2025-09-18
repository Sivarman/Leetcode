class Solution(object):
    def targetIndices(self, nums, target):
        a=sorted(nums)
        # for i in range(len(nums)):
        #     if nums[i] == target:
        indices = [i for i in range(len(a)) if a[i]==target]
        if(len(indices)>0):
            return indices
        else:
            return []
    
        