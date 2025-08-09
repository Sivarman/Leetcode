class Solution(object):
    def mostWordsFound(self, sentences):
        a=[]
        for i in sentences:
            a.append(len(i.split()))
        return max(a)
        