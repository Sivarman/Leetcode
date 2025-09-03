class Solution(object):
    def maximumCount(self, nums):
        a=0
        b=0
        for i in nums:
            if(i<0):
                a+=1
            if(i>0):
                b+=1
        if(b>a):
            return b
        else:
            return a

        