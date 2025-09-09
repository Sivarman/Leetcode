class Solution(object):
    def countWords(self, words1, words2):
        result=0
        a=set(words1)
        b=set(words2)
        c=a.intersection(b)
        c=list(c)
        for i in c:
            if((words1.count(i)==1) and (words2.count(i)==1)):
                result+=1
        return result
    
        