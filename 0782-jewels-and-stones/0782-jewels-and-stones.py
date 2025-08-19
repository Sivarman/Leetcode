class Solution(object):
    def numJewelsInStones(self, jewels, stones):
        a=0
        for i in jewels:
            a+=stones.count(i)
            
        return a
