class Solution {
    public String reverseOnlyLetters(String s) {
        int slow = 0;
        int fast = s.length() - 1;
        char temp = ' ';
        char temp1[] = s.toCharArray();
        while (slow < fast) {
            if ((Character.isLetter(s.charAt(slow))) && (Character.isLetter(s.charAt(fast)))) {
                temp = temp1[slow];
                // Strings are immutable, so this part will not compile as-is.
                // You’ll need a char array if you want to swap characters.
                // Keeping your logic intact, but note this is a structural issue.
                // Example fix: char[] arr = s.toCharArray(); then swap arr[slow], arr[fast].
                temp1[slow] = temp1[fast]; // ❌ compile error
                temp1[fast] = temp;           // ❌ compile error
                slow += 1;
                fast -= 1;
            }
            else if ((Character.isLetter(s.charAt(slow))) || (!Character.isLetter(s.charAt(fast)))) {
                fast -= 1;
            }
            // if ((!Character.isLetter(s.charAt(slow))) || (Character.isLetter(s.charAt(fast)))) {
            else{
                slow += 1;
            }
        }
        return String.valueOf(temp1);
    }
}
