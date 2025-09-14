class Solution(object):
    def arithmeticTriplets(self, nums, diff):
        a=0
        for i in range(len(nums)-2):
            for j in range(i+1,len(nums)-1):
                for k in range(j+1,len(nums)):
                    if((nums[j]-nums[i]==diff) and (nums[k]-nums[j]==diff)):
                        a+=1
        return a
        

        