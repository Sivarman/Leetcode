class Solution:
    def decode(self, encoded: List[int], first: int) -> List[int]:
        arr=[]
        arr.append(first)
        # arr.append(first^encoded[1])
        for i in range(len(encoded)):
            arr.append(arr[i]^encoded[i])
        return arr        
