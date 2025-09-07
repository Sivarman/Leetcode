class Solution(object):
    def vowelStrings(self, words, left, right):
        n=0
        nw=[words[i] for i in range(left,right+1)]
        for i in nw:
            if ((i[0] in ['a', 'e', 'i', 'o','u']) and (i[len(list(i))-1] in ['a', 'e', 'i', 'o','u'])):
                n+=1
        return n

        