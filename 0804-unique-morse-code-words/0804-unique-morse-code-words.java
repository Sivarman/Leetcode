class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] ans  = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashMap<Character,String> mapper = new HashMap<>();
        // HashMap<String,String> mapper2 = new Hashmap<>();
        Set<String> mapper2 = new HashSet<>();
        String finalstring="";
        for(int i=0;i<26;i++){
            mapper.put((char)('a'+i),ans[i]);
        }
        
        for(String s1:words){
            for(char c1:s1.toCharArray()){
                finalstring+=mapper.get(c1);
            }
            mapper2.add(finalstring);
            finalstring = "";
        }
        return mapper2.size();
    }
}
