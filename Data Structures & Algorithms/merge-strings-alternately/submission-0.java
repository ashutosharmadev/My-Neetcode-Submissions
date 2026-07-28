class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length(), m=word2.length(); // initialise n and m pointers
        StringBuilder result= new StringBuilder(); // Store final merged string
        for(int i=0; i<n||i<m;i++){ // Continue looping until both strings are traversed
            if(i<n){ // if word 1 has characters left over then append
                result.append(word1.charAt(i));
            }
            if(i<m){ // if word 2 has characters left over then append
                result.append(word2.charAt(i)); 
            }
        }
        return result.toString(); // return merged Strings
    }
}