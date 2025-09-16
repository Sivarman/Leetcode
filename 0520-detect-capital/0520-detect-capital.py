class Solution(object):
    def detectCapitalUse(self, word):
        return (word.isupper() or word.islower() or ((word[0].isupper()) and (word[1:].islower())))
        