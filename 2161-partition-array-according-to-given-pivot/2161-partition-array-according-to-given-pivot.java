class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> negnos = new ArrayList<>();
        List<Integer> posnos = new ArrayList<>();
        List<Integer> pivot1 = new ArrayList<>();
        for(int n1:nums){
            if(n1<pivot){
                negnos.add(n1);
            }
            else if(n1>pivot){
                posnos.add(n1);
            }
            else{
                pivot1.add(n1);
            }
        }
        int[] nn1= negnos.stream().mapToInt(Integer::intValue).toArray();
        int[] pn1= posnos.stream().mapToInt(Integer::intValue).toArray();
        int[] pin1= pivot1.stream().mapToInt(Integer::intValue).toArray(); 
        int[] res =new int[nums.length];
        
        
        
        for(int i=0;i<nn1.length;i++){
            res[i] = nn1[i];
        }
        int pivotj=0;
        for(int i=nn1.length;i<(nn1.length+pin1.length);i++){
             res[i] = pin1[pivotj];
             pivotj+=1;
         }
         int posj=0;
        for(int i=(pin1.length+nn1.length);i<nums.length;i++){
             res[i] = pn1[posj]; 
             posj+=1;
         }
        return res;
}
}
