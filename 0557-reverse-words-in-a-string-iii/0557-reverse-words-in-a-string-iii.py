class Solution:
    def reverseWords(self, s: str) -> str:
        ns=s.split()
        rs=[i[::-1] for i in ns]
        revstring=" ".join(rs)
        return revstring
