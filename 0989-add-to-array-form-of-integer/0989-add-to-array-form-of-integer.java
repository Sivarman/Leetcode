import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        String n1="";
        List<Integer> nos = new ArrayList<>();
        for(int n:num){
            n1+=String.valueOf(n);
        }
        BigInteger ns1 = new BigInteger(n1);
        BigInteger ns2 = ns1.add(BigInteger.valueOf(k)); 
        String n2=String.valueOf(ns2);
        for(int i=0;i<n2.length();i++){
            nos.add(n2.charAt(i)-'0');    
        }
        return nos;
        }
    }