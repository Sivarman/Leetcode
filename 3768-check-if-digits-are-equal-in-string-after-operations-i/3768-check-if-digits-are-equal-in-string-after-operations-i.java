class Solution {
    public boolean hasSameDigits(String s) {
        String s2="";
        String s1=s;
        int n1=0;
        // int length=s.length();
        while(true){
            if(s1.length()==2){
                break;
            }
            else{
                for(int i=0;i<s1.length()-1;i++){
                    n1=((s1.charAt(i)-'0')+(s1.charAt(i+1)-'0'))%10;
                    s2+=Integer.toString(n1);
                }
                s1=s2;
                n1=0;
                s2="";
            }
        }
        return s1.charAt(0)==s1.charAt(1);
    }
}
