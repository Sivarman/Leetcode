class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> nos  = new ArrayList<>();
        String s2="[^0]+";
        String s1="";
        int j=0;
        int p;
        int t=0;
        for(int i=left;i<=right;i++){
            s1=String.valueOf(i);
            if((s1.matches(s2))){
                j=s1.length()-1;
                while(j>=0){
                    p=s1.charAt(j)-'0';
                    if(!(i%p==0)){
                        break;
                    }
                    else{
                        t+=1;
                    }
                    j-=1;
                }
                if(t==s1.length()){
                    nos.add(i);
                }
                t=0;
            }
        }
    return nos;
    }
}