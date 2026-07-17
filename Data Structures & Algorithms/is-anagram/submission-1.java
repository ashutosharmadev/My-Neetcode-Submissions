class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()){ // since an has to have the number of characters
            return false;
        }
        int[] char_counts= new int[26]; // initialised array that counts the characters
        for (int i=0;i<s.length();i++){
            char_counts[s.charAt(i)-'a']++; // Adds the count from string s
            char_counts[t.charAt(i)-'a']--; // Removes the count from string t
        }
        for(int char_count:char_counts){
            if(char_count!=0){ // The final char_count should be 0
                return false;
            }
        }
        return true;
    }
}
