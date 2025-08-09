class Solution(object):
    def toLowerCase(self, s):
        p=""
        for i in range(len(s)):
            if(s[i].isupper()):
                p+=s[i].lower()
            else:
                p+=s[i]
        return p
        
