class Solution {
    public String firstPalindrome(String[] words) {
        int slow;
        int fast;
        int i=0;
        String ans="";
        for(String s1:words){
            slow=0;
            fast=s1.length()-1;
            while(slow<fast){
                if(s1.charAt(slow)!=s1.charAt(fast)){
                    break;
                }
                else{
                    i+=1;
                    slow+=1;
                    fast-=1;
                }
            }
            if(i==(s1.length()/2)){
                ans=s1;
                break;
            }
            i=0;
        }
        return ans;
    }
}