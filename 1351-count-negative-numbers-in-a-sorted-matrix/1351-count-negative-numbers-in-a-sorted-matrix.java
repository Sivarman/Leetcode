class Solution {
    public int countNegatives(int[][] grid) {
        int a1=0;
        int n=grid.length;
        int a = grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<a;j++){
                if(grid[i][j]<0){
                    a1+=1;

                }
            }
            

        }
        return a1;
    }
}