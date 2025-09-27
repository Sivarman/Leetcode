class Solution:
    def maxDifference(self, s: str) -> int:
        count=[s.count(i) for i in set(s)]
        eno=[i for i in count if(i%2==0)]
        ono=[i for i in count if(i%2!=0)]
        a=max(ono)
        b=min(eno)
        return (a-b)      
