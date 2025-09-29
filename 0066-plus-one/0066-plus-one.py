class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        a=""
        for i in range(len(digits)):
            a+=str(digits[i])
        b=int(a)
        b+=1
        nd=[]
        while(b!=0):
            r=b%10
            nd.append(r)
            b=b/10
        return nd[::-1]

        