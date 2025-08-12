class Solution {
public:
    bool checkPerfectNumber(int num) {
        int sum1=0;
        int t=num;
        for(int i=1;i<=(num/2);i++){
            if(t%i==0){
                sum1+=i;
            }
        }
        if(t==sum1){
            return true;
        }
        else{
            return false;
        }
}
};
