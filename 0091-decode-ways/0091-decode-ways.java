class Solution {
    public int numDecodings(String s) {
        int n=s.length();
        int[] dp = new int[n+1];
        dp[0] = 1;
        if(s.charAt(0)!='0'){
            dp[1]=1;
        }
        for(int i=2;i<=n;i++){
            int onedigit = s.charAt(i-1)-'0';
            int twodigits = Integer.parseInt(s.substring(i-2,i));
            if(onedigit>=1 && onedigit<=9){
                dp[i]+=dp[i-1];
            }
            if(twodigits>=10 && twodigits<=26){
                dp[i]+=dp[i-2];
            }

        }
        return dp[n];

    }
}