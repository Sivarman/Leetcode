class Solution {
        int vowelcount(String s){
            List<Character> vowels = new ArrayList<>();
            vowels.add('a');
            vowels.add('e');
            vowels.add('i');
            vowels.add('o');
            vowels.add('u');
            int counter=0;
            for(char c1:s.toCharArray()){
                if(vowels.contains(c1)){
                    counter+=1;
                }
            }
            return counter;
        }
        String reverseWords(String s) {
        
            String[] temp1 = s.split(" ");
            char[] ct;
            char temp=' ';
            int a=0;
            int slow=0;
            int fast=0;
            int vc=0;
            a=vowelcount(temp1[0]);
            for(int i=1;i<temp1.length;i++){
                vc=vowelcount(temp1[i]);
                ct=temp1[i].toCharArray();
                if(vc==a){
                    fast = temp1[i].length()-1;
                    while(slow<fast){
                        temp = ct[slow];
                        ct[slow] = ct[fast];
                        ct[fast] = temp;
                        slow+=1;
                        fast-=1; 
                    }
                    temp1[i] = String.valueOf(ct);
                    slow=0;   
                }
               
            }
            return String.join(" ",temp1);
        }
        
}
        
