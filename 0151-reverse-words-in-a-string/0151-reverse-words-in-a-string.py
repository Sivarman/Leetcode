class Solution(object):
    def reverseWords(self, s):
        a=s.strip()
        b=a.split()
        c=" ".join(b[::-1])
        return c
