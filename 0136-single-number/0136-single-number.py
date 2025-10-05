class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        a={nums.count(i):i for i in set(nums)}
        return a[1]
