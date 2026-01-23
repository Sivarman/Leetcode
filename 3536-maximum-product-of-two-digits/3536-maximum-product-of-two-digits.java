class Solution {
    public int maxProduct(int n) {
        char[] c1 = String.valueOf(n).toCharArray();
        Arrays.sort(c1);
        int n1 = ((c1[c1.length-1])-'0')*((c1[c1.length-2])-'0');
        return n1;
    }
        
}
