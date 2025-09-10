class Solution(object):
    def smallerNumbersThanCurrent(self, nums):
        a=0
        sml =[]
        for i in range(len(nums)):
            for j in range(0,len(nums)):
                if nums[j]<nums[i] and j!=i:
                    a+=1
            sml.append(a)
            a=0
        return sml            

        