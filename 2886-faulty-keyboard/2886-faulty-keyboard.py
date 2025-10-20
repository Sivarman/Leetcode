class Solution:
    def finalString(self, s: str) -> str:
        a=""
        for j in range(len(s)):
            if(s[j]=='i'):
                a=a[::-1]
            else:
               a+=s[j] 
        return a
