class Solution {
    public int repeatedNTimes(int[] nums) {
        int find = nums.length/2;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int count=0;
        int a=0;
        for(int n1:nums){
            if(!hm.containsKey(n1)){
                hm.put(n1,count+1);
                
            }
            else{
                hm.put(n1,hm.get(n1)+1);
            }
        }
        Set<Integer> s = hm.keySet();
        for(int n2:s){
            if(hm.get(n2)==find)
            {   
                a=n2;
            }
        }
        
        return a;
    }
}