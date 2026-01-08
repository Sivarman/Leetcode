class Solution {
    
    public int decider(String s1){
        int slow=0;
        int fast=s1.length()-1;
        char temp=' ';
        char[] temp1=s1.toCharArray();
        while(slow<fast){
            temp = temp1[slow];
            temp1[slow] = temp1[fast];
            temp1[fast] = temp;
            slow+=1;
            fast-=1;
        }
        return Integer.parseInt(String.valueOf(temp1));
    }
    public int countDistinctIntegers(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int count=0;
        int ri=0;
        for(int n1:nums){
            if(!hm.containsKey(n1)){
                hm.put(n1,count+1);
            }
            else{
                hm.put(n1,hm.get(n1)+1);
            }
            ri=decider(Integer.toString(n1));
            if(!hm.containsKey(ri)){
                hm.put(ri,count+1);
            }
            else{
                hm.put(ri,hm.get(ri)+1);
            }
        }
        Set<Integer> ok = hm.keySet();

        return ok.size();
    }
}
