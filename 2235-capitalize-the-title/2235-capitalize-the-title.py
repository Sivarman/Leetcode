class Solution(object):
    def capitalizeTitle(self, title):
        a=title.split()
        for i in range(len(a)):
            if(len(a[i])>=3):
                a[i]=a[i].capitalize()
            else:
                a[i]=a[i].lower()
        ns=" ".join(a)
        return ns

        