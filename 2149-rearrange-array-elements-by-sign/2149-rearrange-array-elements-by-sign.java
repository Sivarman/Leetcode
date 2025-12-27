class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pnos = new int[nums.length/2];
        int[] onos = new int[nums.length/2];
        int[] result = new int[nums.length];
        List<Integer> lpnos = new ArrayList<>();
        List<Integer> lonos = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                lpnos.add(nums[i]);
            }
            else{
                lonos.add(nums[i]);
            }
        }
        pnos =  lpnos.stream().mapToInt(Integer::intValue).toArray();
        onos = lonos.stream().mapToInt(Integer::intValue).toArray();
        int j=0;
        for(int i=0;i<nums.length;i+=2){
            result[i] = pnos[j];
            result[i+1] = onos[j];
            j++;
        }
        return result;
    
    }   
}
