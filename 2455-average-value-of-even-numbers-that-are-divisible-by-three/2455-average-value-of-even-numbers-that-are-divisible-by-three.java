class Solution {
    public int averageValue(int[] nums) {
        int count=0;
        int sum1=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i]%6==0)){
                sum1+=nums[i];
                count+=1;
            }
        }
        if(count==0){
            return 0;
        }
        else{
            return sum1/count;
        }
    }
}
