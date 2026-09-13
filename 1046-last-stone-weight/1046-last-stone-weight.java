class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone:stones){
            maxheap.add(stone);
        }
        while(maxheap.size()>1){
            int x = maxheap.poll();
            int y = maxheap.poll();
            if(x!=y){
                maxheap.add(x-y);
            }
        }
        if(maxheap.size()==0){

            return 0;
        }
        return maxheap.peek();

    }
}