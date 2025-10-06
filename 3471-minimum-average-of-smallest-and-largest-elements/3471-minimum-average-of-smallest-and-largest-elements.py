class Solution:
    def minimumAverage(self, nums: List[int]) -> float:
        averages=[]
        mine=0
        maxe=0
        while(len(nums)!=0):
            mine= min(nums)
            maxe=max(nums)
            averages.append((float(mine)+maxe)/2)
            nums.remove(mine)
            nums.remove(maxe)
        return min(averages)
