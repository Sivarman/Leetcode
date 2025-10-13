class Solution:
    def greatestLetter(self, s: str) -> str:
        a=set(s)
        c=0
        b=[]
        for i in a:
            if(i.isupper()):
                if(i.lower() in a):
                    c+=1
            # if(i.islower()):
            #     if(i.upper() in a):
            #         c+=1
            if(c>0):
                b.append(i)
                c=0
        if(len(b)>0):
            return max(b).upper()
        else:
            return ""
