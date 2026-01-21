class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer> nos = new HashMap<>();
        int count=0;
        int sum1=0;
        for(int n1:nums){
            if(!nos.containsKey(n1)){
                nos.put(n1,count+1);
            }
            else{
                nos.put(n1,nos.get(n1)+1);
            }
        }
        List<Integer> nos1 = new ArrayList<>(nos.keySet());
        for(int n2:nos1){
            if(nos.get(n2)%k==0){   
                sum1+=n2*nos.get(n2);
            }
        }
        return sum1;
    }
}