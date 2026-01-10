class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[i];
        }
        int j=0;
        for(int i=nums.length;i<nums.length*2;i++){
            arr[i] = nums[j];
            j+=1;
        }
        
        return arr;
    }
}
