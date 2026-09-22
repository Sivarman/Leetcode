class Solution {
    public int lengthOfLIS(int[] nums) {
        int n= nums.length;
        int[] dp= new int[n];
        int answer = 1;
        for(int i=0;i<n;i++){
            dp[i] = 1;
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            answer = Math.max(dp[i],answer);
        }
        return answer;
    }
}