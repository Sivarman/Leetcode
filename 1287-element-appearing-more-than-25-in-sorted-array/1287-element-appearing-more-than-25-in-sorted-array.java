class Solution {
    public int findSpecialInteger(int[] arr) {
        int threshold = arr.length/4;
        int result=0;
        int count=0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int n1:arr){    
            if(!hm.containsKey(n1)){
                hm.put(n1,count+1);
                if(hm.get(n1)>threshold){
                    result=n1;
                    break;
                }
            }
            else{
                hm.put(n1,hm.get(n1)+1);
                if(hm.get(n1)>threshold){
                    result=n1;
                    break;
                }
                
            }
        }
        return result;
    }
}