class Solution(object):
    def countCompleteDayPairs(self, hours):
        a=0
        for i in range(len(hours)-1):
            for j in range(i+1,len(hours)):
                if((hours[i] + hours[j])%24==0):
                    a+=1
        return a

        