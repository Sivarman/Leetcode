class Solution(object):
    def createTargetArray(self, nums, index):
        target = []
        for i in range(len(index)):
            target.insert(index[i],nums[i])
            # index.remove(i)
        return target
