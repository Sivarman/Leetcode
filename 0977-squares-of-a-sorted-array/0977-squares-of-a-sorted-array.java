class Solution {
    public int[] sortedSquares(int[] nums) {
        // Arrays.sort(nums);
        int[] result = new int[nums.length];
       
        for(int i=0;i<nums.length;i++){
            result[i] = nums[i]*nums[i];
        }
        Arrays.sort(result);
        return result;
        // for(int n1:result){
            
        // }
    }
}