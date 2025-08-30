class Solution(object):
    def lengthOfLastWord(self, s):
        n = s.strip()
        a = n.split()
        return len(a[len(a)-1])

        