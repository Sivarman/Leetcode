class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize!=0){
            return false;
        }
        HashMap<Integer,Integer> count  = new HashMap<>();
        for(int card:hand){
            count.put(card,count.getOrDefault(card,0)+1);
        }
        Arrays.sort(hand);
        for(int card:hand){
            if(count.get(card)==0){
                continue;
            }
            for(int i=0;i<groupSize;i++){
                int currentcard = card+i;
                if(count.getOrDefault(currentcard,0)==0){
                    return false;
                }   
                count.put(currentcard,count.get(currentcard)-1);
            }
        }
        return true;
    }
}