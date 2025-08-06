class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]):
        nums3 = nums1+nums2
        nums3=sorted(nums3)
        return median(nums3)

        