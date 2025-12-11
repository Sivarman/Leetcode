class Solution {
    public void reverseString(char[] s) {
        char temp=' ';
        int slow = 0;
        int fast = s.length-1;
        while(slow<fast){
            temp = s[slow];
            s[slow] = s[fast];
            s[fast] = temp;
            slow+=1;
            fast-=1;
        }
    }
}