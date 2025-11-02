class Solution:
    def reverseDegree(self, s: str) -> int:
        sum1,cnt=0,0
        for i in s:
            cnt+=1
            a=(123-ord(i))*(cnt)
            sum1+=a
            
        return sum1
