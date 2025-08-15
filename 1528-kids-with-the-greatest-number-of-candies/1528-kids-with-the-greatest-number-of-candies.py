class Solution(object):
    def kidsWithCandies(self, candies, extraCandies):
        
        ba=[]
        for i in candies:
            if(i+extraCandies)>=max(candies):
                ba.append(True)
            else:
                ba.append(False)
        return ba

        