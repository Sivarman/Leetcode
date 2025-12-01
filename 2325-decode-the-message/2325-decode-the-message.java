class Solution {
    public String decodeMessage(String key, String message) {
        String s1="";
        HashMap<Character,Character> msg = new HashMap<>();
        int i=0;
        for(char c1:key.toCharArray())
        {   
            if(c1==' '){
                continue;
            }
            else{
                if(!(msg.containsKey(c1))){
                    msg.put(c1,(char)('a'+i));
                    i+=1;
            }
        }
        }
        for(char c1:message.toCharArray()){
            if(c1==' '){
                s1+=" ";
            }
            else{
                s1+=msg.get(c1);
            }
        }
        return s1;
    }
}
