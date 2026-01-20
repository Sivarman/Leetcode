class Solution {
    public int maxDistinct(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int count=0;
        for(char c1:s.toCharArray()){
            if(!hm.containsKey(c1)){
                hm.put(c1,count+1);
            }
            else{
                hm.put(c1,hm.get(c1)+1);
            }
        }
        return hm.keySet().size();
    }
}