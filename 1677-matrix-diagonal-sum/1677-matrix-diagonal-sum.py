class Solution:
    def diagonalSum(self, mat: List[List[int]]) -> int:
        t=len(mat)
        sum1=0
        # if(t%2!=0):
        for i in range(len(mat)):
            for j in range(len(mat[i])):
                if((i==j) or(i+j==(t-1))):
                    sum1+=mat[i][j]
        return sum1
