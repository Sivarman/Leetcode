class Solution {
    public int sumFourDivisors(int[] nums) {
        int noofdivisors=2;
        int sum1=0;
        int numsum=0;
        int decider=0;
        for(int n1:nums){
            sum1=n1+1;
            for(int i=2;i<=(n1/2);i++){
                if(n1%i==0){
                    sum1+=i;
                    noofdivisors+=1;
                    if(noofdivisors>4){
                        break;
                    }
                }
            }
            if(noofdivisors==4){   
                numsum+=sum1;
            }
            noofdivisors=2;
            sum1=0;
        }
        return numsum;
    }
}