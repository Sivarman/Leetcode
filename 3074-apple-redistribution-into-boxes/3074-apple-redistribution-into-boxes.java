class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int tna = 0;
        int a=0;
        Arrays.sort(capacity);
        for(int n1:apple){
            tna+=n1;
        }
        for(int i=capacity.length-1;i>=0;i--){
            tna-=capacity[i];
            a+=1;
            if(tna<=0){
                break;
            }   
            
        }
        return a;
    }
}
