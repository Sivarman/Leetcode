class Solution(object):
    def truncateSentence(self, s, k):
        ns = s.split()
        rs=""
        j=0
        for i in range(k):
            rs+=ns[i]
            if i<k-1:
                rs+=" "
        return rs
