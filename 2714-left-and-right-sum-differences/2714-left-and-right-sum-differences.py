class Solution:
    def leftRightDifference(self, nums: List[int]) -> List[int]:
        ls,rs,res=[0],[],[]
        for i in range(len(nums)-1):
            ls.append(sum(nums[:i+1]))
        for i in range(len(nums)-1):
            rs.append(sum(nums[i+1:]))
        rs.append(0)
        for i in range(len(ls)):
            res.append(abs(ls[i]-rs[i]))
        return res
