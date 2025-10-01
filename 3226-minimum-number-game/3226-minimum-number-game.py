class Solution(object):
    def numberGame(self, nums):
        arr=[]
        for i in range(len(nums)):
            while(len(nums)!=0):
                a=min(nums)
                nums.remove(a)
                b=min(nums)
                nums.remove(b)
                arr.append(b)
                arr.append(a)
        return arr

        