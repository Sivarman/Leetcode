class Solution {
    public boolean isThree(int n) {
        int a=2;
        for(int i=2;i<=(n/2);i++){
            if(n%i==0){
                a+=1;
            }
        }
        return (a==3);
    }
}
