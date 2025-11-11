class Solution {
    public int countOperations(int num1, int num2) {
        int count = 0;
        if(num1==0 || num2==0){
            return 0;
        }
        else{
            while(true){
                if(num1>=num2){
                    num1=num1-num2;
                    count+=1;
                    if((num1==0) || (num2==0)){
                        break;
                    }
                }
                else{
                    num2=num2-num1;
                    count+=1;
                    if((num1==0) || (num2==0)){
                        break;
                    }
                }
            }
            return count;
        }
   
    }
}
