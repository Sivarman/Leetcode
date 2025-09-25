class Solution:
    def getNoZeroIntegers(self, n: int) -> List[int]:
        t='0'
        c=1
        a=[c for c in range(c,n)]
        for i in range(len(a)):
            for j in range(i,len(a)):
                if(((t not in str(a[i])) and (t not in str(a[j]))) and (a[i]+a[j]==n)):
                    return [a[i],a[j]]
