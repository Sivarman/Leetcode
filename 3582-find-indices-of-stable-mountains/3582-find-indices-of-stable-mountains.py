class Solution(object):
    def stableMountains(self, height, threshold):
        h=[]
        i=0
        for i in range(i+1,len(height)):
            if (height[i-1]>threshold):
                h.append(i)
            
        return h

        