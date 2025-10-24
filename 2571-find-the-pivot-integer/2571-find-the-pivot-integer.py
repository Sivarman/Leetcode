class Solution:
    def pivotInteger(self, n: int) -> int:
        # for i in range(1,n+1):
        #     for j in range(i,i)
        nos=[i for i in range(1,n+1)]
        for i in nos:
            if(sum(nos[0:i])==sum(nos[i-1:n])):
                return i
        return -1
