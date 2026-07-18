class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>>map= new HashMap<>(); // Initialise Hashmap
        for (String s:strs){ // Go through String S for every strs
            char[] chars=s.toCharArray(); // Convert words into characters Array
            Arrays.sort((chars)); // Sort the characters array alphabetically
            String sortedS= new String(chars); // Convert the sorted characters into a new string
            map.putIfAbsent(sortedS,new ArrayList<>()); // If key does not exist then create a new empty Array  
                map.get(sortedS).add(s); // Get list and add string s
        }
        return new ArrayList<>(map.values()); // Return grouped list
    }
}
