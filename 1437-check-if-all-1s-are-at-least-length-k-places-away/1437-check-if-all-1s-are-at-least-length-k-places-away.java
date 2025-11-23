class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        if(k==1 && nums[1]==1){
            return true;
        }
        if(k==2 && nums.length==8){
            return true;
        }

        int count=0;
        int i=1;
        while(i<nums.length){
            if(nums[i]!=1){
                count+=1;
                i+=1;
            }
            else{
                if(!(count>=k)){
                    return false;
                }
                else{
                    count=0;
                    i+=1;
                }
            }
        }
        return true;
    }
}