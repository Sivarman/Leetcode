class Solution:
    def isSameAfterReversals(self, num: int) -> bool:
        b,c,=0,0
        a=str(num)
        a1=a[::-1]
        b=int(a1)
        bstr=str(b)
        b1=bstr[::-1]
        c=int(b1)
        return num==c
