class Solution {
    public int secondHighest(String s) {
        HashSet<Integer> nos = new HashSet<>();
        for(char c1:s.toCharArray()){
            if(Character.isDigit(c1)){
                nos.add(c1-'0');
            }
        }
        List<Integer> ns = new ArrayList<>(nos);
        Collections.sort(ns);
        if(ns.size()>1){
            return ns.get(ns.size()-2);
        }
        else{
            return -1;
        }


    }
}