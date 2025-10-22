class Solution:
    def alternatingSum(self, nums: List[int]) -> int:
        sum1=0
        for i in range(len(nums)):
            if(i%2!=0):
                sum1-=nums[i]
            else:
                sum1+=nums[i]
        return sum1
