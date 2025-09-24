class Solution:
    def countSeniors(self, details: List[str]) -> int:
        a=0
        for i in details:
            if(int(i[11:13])>60):
                a+=1
        return a
