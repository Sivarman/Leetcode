class Solution {
    public int absDifference(int[] nums, int k) {
        int suml=0;
        int sums=0;
        Arrays.sort(nums);
        int j=nums.length-1;
        int nooftimesl=0;
        while(nooftimesl<k){
            suml+=nums[j];
            j-=1;
            nooftimesl+=1;
        }
        int nooftimess=0;
        int i=0;
        while(nooftimess<k){
            sums+=nums[i];
            i+=1;
            nooftimess+=1;
        }
        return Math.abs(suml-sums);
    }
}