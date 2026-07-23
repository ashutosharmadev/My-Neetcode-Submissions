class Solution {
    public boolean isPalindrome(String s) {
       int L= 0; // Initialise Left Pointer pointing at the start
       int R= s.length()-1; // Initialise Right pointer pointing at the end of string
       while(L<R){
        while(L<R && !alphaNum(s.charAt(L))){
            L++; // Keep incrementing to the right 
        }
        while (R>L && !alphaNum(s.charAt(R))){
            R--; // Keep decrementing to the left
        }
        if (Character.toLowerCase(s.charAt(L))!=Character.toLowerCase(s.charAt(R))){
        return false; // if character doesnt match return
       }
       L++; R--; // the moment they cross places 
       }
       return true; // return true 
    }
}

public boolean alphaNum(char c){ // changes alphabets according to number
    return(c>='A'&& c<='Z'||
           c>='a' && c<='z'||
           c>='0'&& c<='9');
}
