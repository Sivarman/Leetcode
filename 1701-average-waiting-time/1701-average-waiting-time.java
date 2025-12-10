class Solution {
    public double averageWaitingTime(int[][] customers) {
        double ftime = (customers[0][0]+customers[0][1]);
        double waitime  = ftime - customers[0][0];
        for(int i=1;i<customers.length;i++){
            if(ftime<customers[i][0]){
                ftime=customers[i][0]+customers[i][1];
                waitime+=ftime-customers[i][0];
            }
            else{
                ftime+=customers[i][1];
                waitime+= ftime - customers[i][0];
            }
    }
        return waitime/customers.length;
        
    }
}
