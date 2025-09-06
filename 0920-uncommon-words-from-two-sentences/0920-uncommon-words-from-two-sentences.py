class Solution(object):
    def uncommonFromSentences(self, s1, s2):
        a=[]
        s3=s1.split()
        s4=s2.split()
        for i in set(s3):
            if(s3.count(i)==1 and i not in s4):
                a.append(i)
        for i in set(s4):
            if(s4.count(i)==1 and i not in s3):
                a.append(i)
        
        return a

        