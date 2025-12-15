class Solution {
    public String reverseVowels(String s) {
        int slow=0;
        int fast = s.length()-1;
        char t=' ';
        char[] temp = s.toCharArray();
        List<Character> vowels  = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        while(slow<fast){ 
            if(s.length()==1){
                return s;

            }
            else{
                if((vowels.contains(Character.toLowerCase(temp[slow]))) && (!vowels.contains(Character.toLowerCase(temp[fast])))){
                fast-=1;
            }
            if((!vowels.contains(Character.toLowerCase(temp[slow]))) && (vowels.contains(Character.toLowerCase(temp[fast])))){
                slow+=1;
            }
            if((vowels.contains(Character.toLowerCase(temp[slow]))) && (vowels.contains(Character.toLowerCase(temp[fast])))){
                t = temp[slow];
                temp[slow]  = temp[fast];
                temp[fast] = t;
                slow+=1;
                fast-=1;
            }
            if(slow<fast&&(!vowels.contains(Character.toLowerCase(temp[slow]))) && (!vowels.contains(Character.toLowerCase(temp[fast])))){
                // System.out.println("siva");
                slow+=1;
                fast-=1;
            }
          
            
        }
        
    }
      return String.valueOf(temp);
    }
}