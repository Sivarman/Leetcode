class Solution {
    public int findPermutationDifference(String s, String t) {
        int sum1=0;
        for(int i=0;i<s.toCharArray().length;i++){
            sum1+=Math.abs(i-t.indexOf(s.charAt(i)));
        }   
        return sum1;
    }
}
