class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int position= 0;
        int i=0;
        int j=0;
        for(String s1:commands){
            if(s1.equals("RIGHT")){
                j+=1;
                position = (i*n)+(j);
            }
            else if(s1.equals("LEFT")){
                j-=1;
                position = (i*n)+(j);
            }
            else if(s1.equals("DOWN")){
                i+=1;
                position = (i*n)+(j);
            }
            else{
                i-=1;
                position = (i*n)+(j);
            }
        }
        return position;
    }
        
}
