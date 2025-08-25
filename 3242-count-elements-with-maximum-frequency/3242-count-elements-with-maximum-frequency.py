class Solution(object):
    def maxFrequencyElements(self, nums):
        c=0
        a=[nums.count(i) for i in set(nums)]
        b=max(a)
        for i in a:
            if(b==i):
                c+=1
        return c*b    
