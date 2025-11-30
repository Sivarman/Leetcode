class Solution {
    public int minOperations(int[] nums, int k) {
        int sum1=0;
        for(int i=0;i<nums.length;i++){
            sum1+=nums[i];
        }
        return sum1%k;
    }
}
