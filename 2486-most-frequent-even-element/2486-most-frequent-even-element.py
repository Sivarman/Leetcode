class Solution(object):
    def mostFrequentEven(self, nums):
        nums3=[]
        nums1= [i for i in nums if(i%2==0)]
        if(len(nums1)>0):
            nums2={i:nums1.count(i) for i in set(nums1)}
            nums4=[v for k,v in nums2.items()]
            v1=max(nums4)
            for k,v in nums2.items():
                if v==v1:
                    nums3.append(k)
            return min(nums3)
        else:
            return -1

        