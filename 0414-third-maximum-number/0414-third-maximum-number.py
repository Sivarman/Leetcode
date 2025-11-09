class Solution:
    def thirdMax(self, nums: List[int]) -> int:
       
        nums1= sorted(list(set(nums)),reverse=True)
        if(len(nums1)>=3):
            return nums1[2]
        else:
            return max(nums1)
