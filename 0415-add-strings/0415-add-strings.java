import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger no1 = new BigInteger(num1);
        BigInteger no2 = new BigInteger(num2);
        BigInteger no3 = no1.add(no2);
        return String.valueOf(no3);

    }   
}