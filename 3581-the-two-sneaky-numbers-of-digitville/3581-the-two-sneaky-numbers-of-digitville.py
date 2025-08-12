class Solution(object):
    def getSneakyNumbers(self, nums):
        a={i:nums.count(i) for i in nums}
        b=[]
        for i,j in a.items():
            if(j==2):
                b.append(i)
        return b