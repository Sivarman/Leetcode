class Solution {
    public String restoreString(String s, int[] indices) {
        String s1 = "";
        int counter = 0;
        for(int i=0;i<indices.length;i++){
            for(int j=0;j<indices.length;j++){
                if(indices[j]==counter){
                    s1+=s.charAt(j);
                    counter+=1;
                    break;
                }
            }
        }
        return s1;
        
    }
}
