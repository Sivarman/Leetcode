class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int result=0;
        String s1="";
        int n=0;
        int sum1=0;
        int sum2=0;
        for(int i=low;i<=high;i++){
            if(String.valueOf(i).length()%2==0){
                s1=String.valueOf(i);
                n=s1.length()/2;
                int j=0;
                while(j<n){
                    sum1+=s1.charAt(j)-'0';
                    j+=1;
                }
                int k=s1.length()-1;
                while(k>=n){
                    sum2+=s1.charAt(k)-'0';
                    k-=1;
                }
                if(sum1==sum2){
                    result+=1;
                }
                sum1=0;
                sum2=0;
            }
        }
        return result;
    }
}
