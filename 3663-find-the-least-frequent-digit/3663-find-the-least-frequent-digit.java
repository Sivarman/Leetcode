class Solution {
    public int getLeastFrequentDigit(int n) {
        char[] s1 = String.valueOf(n).toCharArray();
        HashMap<Character,Integer> hm = new HashMap<>();
        int count=0;
        for(char c1:s1){
            if(!hm.containsKey(c1)){
                hm.put(c1,count+1);
            }
            else{
                hm.put(c1,hm.get(c1)+1);
            }
        }
        Set<Integer> onlyvalues = new TreeSet<>(hm.values());
        HashMap<Integer,List<Character>> hm1 = new HashMap<>();
        for(Integer n1:onlyvalues){
            for(char c1:s1){
                if(hm.get(c1)==n1){
                    hm1.putIfAbsent(n1,new ArrayList<>());
                    hm1.get(n1).add(c1);
                }
            }
        }
        List<Integer> oks = new ArrayList<>(hm1.keySet());
        Collections.sort(oks);
        Collections.sort(hm1.get(oks.get(0)));
        return (hm1.get(oks.get(0)).get(0))-'0';
    }
}