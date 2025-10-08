class Solution:
    def maximumOddBinaryNumber(self, s: str) -> str:
        ns=list(s)
        for i in ns:
            if(i=='1'):
                ix=ns.index(i)
                break
        ns[len(s)-1],ns[ix]=ns[ix],ns[len(s)-1]
        thelastone=ns[len(ns)-1]
        ats=ns[:len(ns)-1]
        newarray=sorted(ats,reverse=True)
        newarray.append(thelastone)
        str1=""
        for i in newarray:
            str1+=i
        return str1
