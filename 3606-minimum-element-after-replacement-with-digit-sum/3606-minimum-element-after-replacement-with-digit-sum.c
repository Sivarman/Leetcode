int minElement(int* nums, int numsSize) {
    int r,sum1=0;
    int min=0;
    for(int i=0;i<numsSize;i++){
        while(nums[i]>0){
            r=nums[i]%10;
            sum1+=r;
            nums[i]=nums[i]/10;
        }
        nums[i]=sum1;
        sum1=0;
        
    }
    min=nums[0];
    for(int i=1;i<numsSize;i++){
        if(nums[i]<min){
            min=nums[i];
        }
    }
    return min;
}
