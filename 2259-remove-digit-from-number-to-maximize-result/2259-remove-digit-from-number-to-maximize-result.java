import java.math.BigInteger;
class Solution {
    public String removeDigit(String number, char digit) {
        // HashMap<Integer,Integer> hm = new HashMap<>();
        char[] c1 = number.toCharArray();
        int i=0;
        String s1=" ";
        String large="0";
        for(char c2:c1){
            if(c2==digit){
                if(i==0){
                    s1 = number.substring(1,number.length());
                }
                else if(i==number.length()-1){
                    s1 =  number.substring(0,i);
                } 
                else{
                    s1 = number.substring(0,i) + number.substring(i+1,number.length());
                }
                int decider  = new BigInteger(s1).compareTo(new BigInteger(large));
                if(decider==0){
                    large = s1; 
                }
                else if(decider>0){
                    large = s1;
                }
                else{
                    s1 = large ;
                }
            }
            i+=1;
        }
        return large;
        // String[] s1 = new String 
    }
}

