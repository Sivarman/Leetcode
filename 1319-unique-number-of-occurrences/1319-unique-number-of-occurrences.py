class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        a=[arr.count(i) for i in set(arr)]
        for i in range(len(a)-1):
            for j in range(i+1,len(a)):
                if(a[i]==a[j]):
                    return False
        return True
        
