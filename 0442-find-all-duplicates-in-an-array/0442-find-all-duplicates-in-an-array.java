class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        List<Integer> nos = new ArrayList<>();
        int count=0;
        for(int n1:nums){
            if(!hm.containsKey(n1)){
                hm.put(n1,count+1);
            }
            else{
                hm.put(n1,hm.get(n1)+1);
            }
        }
        Set<Integer> ok = hm.keySet();
        for(int n1:ok){
            if(hm.get(n1)==2){
                nos.add(n1);
            }
        }
        return nos;
    }
}
