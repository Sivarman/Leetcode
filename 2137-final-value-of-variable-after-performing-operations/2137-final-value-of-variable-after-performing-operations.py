class Solution(object):
    def finalValueAfterOperations(self, operations):
        X=0
        for i in operations:
            if (i =="X++" or i=="++X"):
                X+=1
            else:
                X-=1
        return X       
