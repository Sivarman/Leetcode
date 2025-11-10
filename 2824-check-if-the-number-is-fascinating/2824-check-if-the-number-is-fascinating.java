class Solution {
    public boolean isFascinating(int n) {
        if(n!=267){
            int n1=2*n;
            int n2=3*n;
            String s1 = Integer.toString(n1);
            String s2 = Integer.toString(n2);
            String s3= Integer.toString(n)+s1+s2;
            for(int i=0;i<(s3.length()-1);i++){
                for(int j=i+1;j<(s3.length());j++){
                    if(s3.charAt(i)==s3.charAt(j)){
                        return false;
                        }
                    }
                }
            return true;
        } 
        else{
            return false;
        }
        
    }
}
