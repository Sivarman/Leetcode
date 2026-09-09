class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        int count=0;
        for(int i=0;i<=n;i++){
            int n1=i;
            while(n1!=0){
                if((n1&1)==1){
                    count++;
                }
                n1 = n1>>>1;
            }
                arr[i] = count;
                
                count=0;
            
        }
        return arr;
    }
}