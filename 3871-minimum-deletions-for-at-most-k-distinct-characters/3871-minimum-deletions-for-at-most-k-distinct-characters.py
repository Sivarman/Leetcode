class Solution:
    def minDeletion(self, s: str, k: int) -> int:
        n=len(set(s))
        sum1=0
        a=[s.count(i) for i in set(s)]
        a=sorted(a)
        d=n-k
        if(d<=0):
            return 0
        for i in range(d):
            sum1+=a[i]
        return sum1        
