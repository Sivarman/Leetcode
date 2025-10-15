class Solution:
    def canBeTypedWords(self, text: str, brokenLetters: str) -> int:
        a,b=0,0
        text = text.split()
        for i in text:
            for j in i:
                if(j not in brokenLetters):
                    a+=1
            if(a==len(i)):
                b+=1
            a=0
        return b
