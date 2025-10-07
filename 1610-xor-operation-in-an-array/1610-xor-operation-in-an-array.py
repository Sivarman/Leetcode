class Solution:
    def xorOperation(self, n: int, start: int) -> int:
        result=0
        nums=[start+(2*i) for i in range(n)]
        for i in range(len(nums)):
            result ^= nums[i]
        return result
