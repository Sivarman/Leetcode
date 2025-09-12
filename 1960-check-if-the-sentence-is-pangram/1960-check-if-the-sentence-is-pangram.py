class Solution(object):
    def checkIfPangram(self, sentence):
        return len(list(set(sentence)))==26    
        