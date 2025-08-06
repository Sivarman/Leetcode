class Solution(object):
    def arrayStringsAreEqual(self, word1, word2):
        word3 = ""
        word4 = ""
        for i in word1:
            word3+=i
        for i in word2:
            word4+=i
        return word3==word4
             
        

        