class Solution(object):
    def areOccurrencesEqual(self, s):
        c=0
        a=list(s)
        b=[a.count(i) for i in set(a)]
        if len(list(set(b)))==1:
            return True
        else:
            return False
