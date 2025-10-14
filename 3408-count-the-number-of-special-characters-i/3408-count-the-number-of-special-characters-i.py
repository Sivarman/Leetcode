class Solution:
    def numberOfSpecialChars(self, word: str) -> int:
        s=set(word)
        cnt=0
        for i in s:
            if(i.isupper()):
                if(i.lower() in s):
                    cnt+=1
        return cnt
