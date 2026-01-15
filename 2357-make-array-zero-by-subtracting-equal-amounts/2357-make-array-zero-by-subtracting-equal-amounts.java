class Solution {
    int result=0;
    public int poscounter(int[] nums){
        int posc=0;
        for(int n1:nums){
            if(n1>0){
               posc+=1; 
            }
        }
        return posc;
    }
    public int minfinder(int[] nums){
        int mn=0;
        result+=1;
        int[] na =nums.clone();
        Arrays.sort(na);
        for(int n1:na){
            if(n1!=0){
                mn=n1;
                break;
            }
        }
        return mn;
    }
    public int minimumOperations(int[] nums) {
        int posc=poscounter(nums);
        while(posc!=0){
            int minno=minfinder(nums);
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=0){
                    nums[i] = nums[i]-minno;
                }
            }
            posc=poscounter(nums);
        }
        return result;

    }
}