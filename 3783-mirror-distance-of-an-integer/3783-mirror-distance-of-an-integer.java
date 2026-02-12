class Solution {
    public int mirrorDistance(int n) {
        int slow=0;
        int fast=String.valueOf(n).length()-1;
        char[] temp1  = String.valueOf(n).toCharArray();
        char temp = ' ';
        while(slow<fast){
            temp =  temp1[slow];
            temp1[slow] = temp1[fast];
            temp1[fast] = temp;
            slow+=1;
            fast-=1;
        }
        return Math.abs(n-Integer.parseInt(String.valueOf(temp1)));
    }
}