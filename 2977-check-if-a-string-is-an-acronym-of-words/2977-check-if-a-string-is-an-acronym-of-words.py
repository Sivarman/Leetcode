class Solution:
    def isAcronym(self, words: List[str], s: str) -> bool:
        a=""
        for i in words:
            a+=i[0]
        return a==s    
