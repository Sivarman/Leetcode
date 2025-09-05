class Solution(object):
    def digitCount(self, num):
        a=0
        for i in range(len(num)):
            if num.count(str(i))==int(num[i]):
                a+=1
        return a==len(num)
