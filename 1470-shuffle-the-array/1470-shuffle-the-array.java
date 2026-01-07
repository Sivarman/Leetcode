class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] nums1 = new int[n];
        int[] nums2 = new int[n];
        int[] nums3 = new int[nums.length];
        for(int i=0;i<n;i++){
            nums1[i] = nums[i];
        }
        int i=0;
        for(int j=n;j<nums.length;j++){
            nums2[i] = nums[j];
            i+=1;
        }
        int j=0;
        for(int k=0;k<nums.length;k+=2){
            nums3[k] = nums1[j];
            nums3[k+1] = nums2[j];
            j+=1;
        }
        return nums3;
    }
}