class Solution:
    def findWords(self, words: List[str]) -> List[str]:
        a,b,c,res=0,0,0,[]
        for i in words:
            for j in i:
                if ((j.lower() in "qwertyuiop") and (j.lower() not in "asdfghjkl") and (j.lower() not in "zxcvbnm")):
                   a+=1
                if ((j.lower() not in "qwertyuiop") and (j.lower() in "asdfghjkl") and (j.lower() not in "zxcvbnm")):
                   b+=1
                if ((j.lower() not in "qwertyuiop") and (j.lower() not in "asdfghjkl") and (j.lower() in "zxcvbnm")):
                   c+=1
            if((a==len(i)) or (b==len(i)) or  (c==len(i))):
                res.append(i)
            a,b,c=0,0,0
        return res
