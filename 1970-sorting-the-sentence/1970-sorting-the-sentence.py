class Solution(object):
    def sortSentence(self, s):
        c=[]
        a=s.split()
        b={i[len(i)-1]:i[:len(i)-1] for i in a}
        c=sorted(list(b.keys()))
        d=""
        for k in c:
            d+=b[k]
            d+=" "
        return d[:len(d)-1]

        