class Solution:
    from collections import Counter
    def checkAlmostEquivalent(self, word1: str, word2: str) -> bool:
        cnt=0
        a=dict(Counter(word1))
        b=dict(Counter(word2))
        for k1,v1 in a.items():
            if k1 not in list(b.keys()):
                if(not(a[k1]-0)<=3):
                    return False
            else:
                # for k2,v2 in b.items():
                #     if(k2==k1):
                if(not(abs(a[k1]-b[k1])<=3)):
                    return False
        for k2,v2 in b.items():
            if k2 not in list(a.keys()):
                if(not(b[k2]-0)<=3):
                    return False
            else:
                # for k2,v2 in b.items():
                #     if(k2==k1):
                if(not(abs(b[k2]-a[k2])<=3)):
                    return False
        return True
