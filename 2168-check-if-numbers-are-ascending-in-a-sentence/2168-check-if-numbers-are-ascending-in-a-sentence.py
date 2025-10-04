class Solution(object):
    def areNumbersAscending(self, s):
        a= s.split()
        b=[]
     
        b=[int(i) for i in a if i.isdigit()]
        for i in range(len(b)-1):
            if(not(b[i+1]>b[i])):
                return False
        return True
