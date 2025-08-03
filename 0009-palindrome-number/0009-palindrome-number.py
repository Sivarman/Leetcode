class Solution(object):
    def isPalindrome(self, x):
        a = str(x)
        if((a[len(a)-1::-1])==a):
            return True
        else:
            return False

        