class Solution:
    def findFinalValue(self, nums: List[int], original: int) -> int:
        a=0
        if original in nums:
            a=original*2
            if a in nums:
                while(True):
                    a*=2
                    if a not in nums:
                        break
                return a
            else:
                return a 
        else:
            return original

        