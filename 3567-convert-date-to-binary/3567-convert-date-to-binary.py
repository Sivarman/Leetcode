class Solution(object):
    def convertDateToBinary(self, date):
        ad = date.split('-')
        ads = [bin(int(i))[2:] for i in ad]
        return '-'.join(ads)
