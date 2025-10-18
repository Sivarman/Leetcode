class Solution:
    from collections import Counter 
    def firstUniqChar(self, s: str) -> int:
        a=dict(Counter(s))
        b=""
        # cnt=0
        for k,v in a.items():
            # cnt+=1
            if(v==1):
                b=k
                break
        for i in range(len(s)):
            if(s[i]==b):
                return i
        return -1
