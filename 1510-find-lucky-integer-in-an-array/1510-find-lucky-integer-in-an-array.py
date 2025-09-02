class Solution(object):
    def findLucky(self, arr):
        a=[i for i in set(arr) if(arr.count(i)==i)]
        if(len(a)>0):
            return max(a)
        return -1

        