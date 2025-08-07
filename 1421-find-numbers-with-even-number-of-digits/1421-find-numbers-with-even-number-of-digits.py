class Solution(object):
    def findNumbers(self, nums):
        lenums =[i for i in nums if len(str(i))%2==0]
        return len(lenums) 

        