class Solution(object):
    def similarPairs(self, words):
        a=0
        n=len(words)
        for i in range(n-1):
            for j in range(i+1,n):
                if(set(list(words[i]))==set(list(words[j]))):
                    a+=1
        return a

        