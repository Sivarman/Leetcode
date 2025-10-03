class Solution:
    def maximumTripletValue(self, nums: List[int]) -> int:
 
        b=[]
        for i in range(len(nums)-2):
            for j in range(i+1,len(nums)-1):
                for k in range(j+1,len(nums)):
                    if(i<j<k):
                        b.append((nums[i]-nums[j])*nums[k])
        return max(b) if max(b)>0 else  0 
