class Solution(object):
    def countConsistentStrings(self, allowed, words):
        a=0
        b=0
        for i in words:
            for j in i:
                if j in allowed:
                    a+=1
            if(a==len(i)):
                b+=1
            a=0
            
        return b
                
                    