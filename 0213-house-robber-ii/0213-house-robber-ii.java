class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int case1 = robrange(nums,0,nums.length-2);
        int case2 = robrange(nums,1,nums.length-1);
        return Math.max(case1,case2);
    }
        public int robrange(int[] nums,int start,int end){
            int n=end-start+1;
            int[] dp = new int[n];
            dp[0] = nums[start];
            if(n==1){
                return dp[0];
            }
            dp[1] = Math.max(nums[start],nums[start+1]);
            for(int i=2;i<n;i++){
                dp[i] = Math.max(dp[i-1],dp[i-2]+nums[start+i]);
            }
            return dp[n-1];
            
        }
    }
