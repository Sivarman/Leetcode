class Solution {
    public String replaceDigits(String s) {
        String s2="";
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                s2+=(char)((s.charAt(i-1))+(s.charAt(i)-'0'));
            }
            else{
                s2+=s.charAt(i);
            }
        }
        return s2;
    }
}
