class Solution {
    public boolean validPalindrome(String s) {
        int l=0, r=s.length()-1; // Left aur right pointer ko kro initialise
        while(l<r){ // Traverse kro string ko both ends se
            if(s.charAt(l)!=s.charAt(r)){ // Agr match nhi hote characters 
                return isPalindrome(s,l+1,r) || isPalindrome(s,l,r-1); // Either remove left character or right character
            }
            l++; // Increment left pointer
            r--; // Decrement right pointer
        }
        return true; // Koi mismatch nhi hai toh return krdo string hai palindrome
    }
    private boolean isPalindrome(String s, int l, int r){ // Custom class palindrome check krne ki
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){ // Agr mismatch hua characters
                return false; // Toh voh palindrome nhi hai
            }
            l++; // increment krte jao left pointer ko 
            r--;// decrement krte jao right pointer ko 
        }
        return true;// agr match hue toh mtlab palindrome hai 
    }
}