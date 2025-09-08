class Solution(object):
    def sumZero(self, n):
        a=n/2
        resarr=[]
        if(n%2!=0):
            for i in range(-a,a+1):
                resarr.append(i)
        else:
            for i in range(-a,a+1):
                if(i==0):
                    continue
                else:
                    resarr.append(i)
        return resarr
