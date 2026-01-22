class Solution {
    public String reversePrefix(String s, int k) {
        int slow=0;
        int fast=k-1;
        char[] string1 = s.toCharArray();
        char temp1 = ' ';
        while(slow<fast){
            temp1 = string1[slow];
            string1[slow] = string1[fast];
            string1[fast] = temp1;
            slow+=1;
            fast-=1;
        }
        return String.valueOf(string1);
    }
}
