class Solution(object):
    def missingNumber(self, nums):
        a=0
        nums1,nums2,nums3=[],[],[]
        nums1 = set([i for i in range(len(nums)+1)])
        nums2 = set(nums)
        nums3 = nums1-nums2
        return next(iter(nums3))

        