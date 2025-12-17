class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        int slow;
        int fast;
        char temp=' ';
        String s2="";
        for(String s1:words){
            char[] temp1 = s1.toCharArray();
            slow=0;
            fast=s1.length()-1;
            while(slow<fast){
                temp = temp1[slow];
                temp1[slow]  = temp1[fast];
                temp1[fast] = temp;
                slow+=1;
                fast-=1;
            }
            s2+=String.valueOf(temp1)+" ";
        }
        return s2.trim();
    }
}
