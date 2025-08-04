class Solution(object):
    def countDigits(self, num):
        onum =num
        cnt=0
        while num!=0:
            r=num%10
            if(onum%r==0):
                cnt=cnt+1
            num=num/10
        return cnt

        