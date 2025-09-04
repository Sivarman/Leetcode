class Solution(object):
    def halvesAreAlike(self, s):
        a,b=0,0
        n=len(s)/2
        for i in s[:n]:
            if i.lower() in ['a','e','i','o','u']:
                a+=1
        for j in s[n:]:
            if j.lower() in ['a','e','i','o','u']:
                b+=1
        return a==b
