class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> output  = new ArrayList<>();
        String crtregex = "\\"+separator;
        for(String s1:words){
            String[] s2 = s1.split(crtregex);
            for(String s3:s2){
                if(!s3.isEmpty()){
                    output.add(s3.trim());
                }
            }
            
        }
        return output;
    }
}
