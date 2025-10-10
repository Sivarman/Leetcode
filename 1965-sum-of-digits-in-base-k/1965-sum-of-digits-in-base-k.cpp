class Solution {
public:
    int r=0,sum=0;
    int sumBase(int n, int k) {
        while(n!=0){
            r=n%k;
            sum+=r;
            n=n/k;
            
        }
        return sum;
    }
};
