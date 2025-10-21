class Solution:
    def percentageLetter(self, s: str, letter: str) -> int:
        a=0
        for i in s:
            if(i==letter):
                a+=1
        return int((a/len(s))*100)
