class Solution:
    def checkDivisibility(self, n: int) -> bool:
        a=str(n)
        sum1,product1=0,1
        for i in a:
            sum1+=int(i)
            product1*=int(i)
        return n%(sum1+product1)==0
